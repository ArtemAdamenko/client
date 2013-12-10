package com.cds.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.ByteBuffer;

/**
 * тестовые клиенты (блок)
 *
 */
public class App 
{
    static int request_id = 0;
    public static void main( String[] args ) throws IOException, InterruptedException
    {
        Socket s = null;
        for (Integer j = 0; j <= 100; j++){
            s = new Socket(InetAddress.getByName("192.168.137.3"),8080);      
                OutputStream os = s.getOutputStream();
                byte[] packet = getPacketData();
                os.write(packet);
                os.flush();    
        }
        Thread.sleep(1000);
        getPacketData();
    }
    
    /*
     * Формирование заголовка пакета МБ 10 байт
     */
    private static byte[] getHeader(){
        ByteBuffer b = ByteBuffer.allocate(10);
        
        //тип пакета
        short service_id = GranitV6.Constants.NPH_SRV_NAVDATA;
        b.putShort(service_id);
        short type = GranitV6.Constants.NPH_SND_REALTIME;
        b.putShort(type);
        short flag = GranitV6.Constants.NPH_FLAG_REQUEST;
        b.putShort(flag);
        // уникальный идентификатор пакета в пределах 1-й сессии
        int request = request_id++;
        b.putInt(request);
        
        byte[] header = b.array();
        return header;
    }
    
    /*
     * данные пакета 26 байт + 10 байт
     */
    private static byte[] getPacketData(){
        ByteBuffer b = ByteBuffer.allocate(38);
        
        byte[] header = getHeader();
        b.put(header);
        //Тип ячейки
        byte type = 0;
        b.put(type);
        //Определяет навигационный приемник
        byte number = 0;
        b.put(number);
        //Текущее время
        int timestamp = (int)System.currentTimeMillis();
        b.putInt(timestamp);
        //долгота
        int longitude = 59 * 10000000;
        b.putInt(longitude);
        //широта
        int latitude = 39 * 10000000;
        b.putInt(latitude);
        //дополнительная информация (SOS и т.п.)
        byte extra_dop = 0b11111000;
        b.put(extra_dop);
        //напряжение батареи
        byte bat_voltage = 1;
        b.put(bat_voltage);
        //средняя скорость за период
        short speed_avg = 30;
        b.putShort(speed_avg);
        //максимальная скорость за период
        short speed_max = 50;
        b.putShort(speed_max);
        //направление давижения
        short course = 100;
        b.putShort(course);
        //пройденный путь
        short track = 1000;
        b.putShort(track);
        //высота над уровнем моря
        short altitude = 10;
        b.putShort(altitude);
        //кол-во видимых спутников
        byte nsat = 5;
        b.put(nsat);
        //PDOP Геометрическое расположение спутников
        byte pdop = 5;
        b.put(pdop);
        
        byte[] packet = b.array();
        return packet;
    }
}
