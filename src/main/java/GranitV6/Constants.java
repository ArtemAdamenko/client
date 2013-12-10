package GranitV6;

/**
 *
 * @author Adamenko Artem <adamenko.artem@gmail.com>
 * Хранение hex кодов команд, для взаимодействия с устройством
 */
public class Constants {
    
    /*******************************************************
Navigation data transfer protocol (NDTP)
*******************************************************/
    //#ifndef _NDTP_H_
    //#define _NDTP_H_
    /*******************************************************
    common definitions
    *******************************************************/
    /*protocol version*/
    final static int NDTP_VERSION_HIGH = 6;
    final static int NDTP_VERSION_LOW = 2;
    /*******************************************************
    low level protocol NPL
    *******************************************************/
    /*NPL packet definitions*/
    final static int NPL_PACKET_SIGNATURE = 0x7E7E;
    final static int NPL_PACKET_HEADER_SIZE = 15;
    final static int NPL_PACKET_MAX_SIZE = 1024;
    final static int NPL_PACKET_MAX_DATA_SIZE = (NPL_PACKET_MAX_SIZE - NPL_PACKET_HEADER_SIZE);

    /*NPL packet flags (short int)*/
    final static int NPL_FLAG_ENCRYPTION = 0x0001;
    final static int NPL_FLAG_CRC = 0x0002;
    final static int NPL_FLAG_DELAY = 0x0004;

    /*NPL packet types (byte)*/
    final static int NPL_TYPE_ERROR = 0x01;
    final static int NPL_TYPE_NPH = 0x02;
    final static int NPL_TYPE_DEBUG = 0x03;

    /*NPL address definitions*/
    final static int NPL_ADDRESS_SERVER = 0x00000000;
    final static int NPL_ADDRESS_BROAD_DISPATHERS = 0x00000001;
    final static int NPL_ADDRESS_BROAD_DEVICES = 0x00000002;
    final static int NPL_ADDRESS_RESERVED_MIN = 0x00000003;
    final static int NPL_ADDRESS_RESERVED_MAX = 0x000003FF;
    final static int NPL_ADDRESS_CLIENT_MIN = 0x00000400;
    final static int NPL_ADDRESS_CLIENT_MAX = 0xFFFFFFFE;
    final static int NPL_ADDRESS_DEVICE_MIN = 0x00000400;
    final static int NPL_ADDRESS_DEVICE_MAX = 0x7FFFFFFF;
    final static int NPL_ADDRESS_DISPATHCER_MIN = 0x80000000;
    final static int NPL_ADDRESS_DISPATHCER_MAX = 0xFFFFFFFE;
    final static int NPL_ADDRESS_INVALID = 0xFFFFFFFF;

    /*general errors*/
    final static int NPL_ERR_OK = 0;
    final static int NPL_ERR_DECRYPTION_FAILED = 1;
    final static int NPL_ERR_CRC_FAILED = 2;
    final static int NPL_ERR_UNDEFINED = 0xFFFFFFFF;

    /*routing errors*/
    final static int NPL_ERR_INVALID_PEER_ADDRESS = 100;
    final static int NPL_ERR_PEER_NOT_AVAILABLE = 101;
    final static int NPL_ERR_PEER_PERM_DENIED = 102;

    /*******************************************************
    high level protocol NPH
    *******************************************************/
    /*NPH packet definitions*/
    final static int NPH_PACKET_HEADER_SIZE = 10;
    final static int NPH_PACKET_MAX_SIZE = (NPL_PACKET_MAX_SIZE - NPL_PACKET_HEADER_SIZE);
    final static int NPH_PACKET_MAX_DATA_SIZE = (NPH_PACKET_MAX_SIZE - NPH_PACKET_HEADER_SIZE);

    /*NPH service types*/
    final static int NPH_SRV_GENERIC_CONTROLS = 0;
    public final static int NPH_SRV_NAVDATA = 1;
    final static int NPH_SRV_FILE_TRANSFER = 3;
    final static int NPH_SRV_CLIENT_LIST = 4;
    final static int NPH_SRV_EXTERNAL_DEVICE = 5;
    final static int NPH_SRV_DEBUG = 6;

    /*NPH packet flags (short int)*/
    public final static int NPH_FLAG_REQUEST = 0x0001;

    /*common packets for all services*/
    final static int NPH_RESULT = 0;

    /*NPH_SRV_GENERIC_CONTROLS packets*/
    final static int NPH_SGC_RESULT = 0;                          //NPH_RESULT
    final static int NPH_SGC_CONN_REQUEST = 100;
    final static int NPH_SGC_CONN_AUTH_STRING = 101;
    final static int NPH_SGC_SERVICE_REQUEST = 110;
    final static int NPH_SGC_SERVICES_REQUEST = 111;
    final static int NPH_SGC_SERVICES = 112;
    final static int NPH_SGC_PEER_DESC_REQUEST = 120;
    final static int NPH_SGC_PEER_DESC = 121;

    // PHOTO
    final static int NPH_GET_PAR_PHOTO = 141;
    final static int NPH_SET_PAR_PHOT = 142;
    final static int NPH_PAR_PHOTO_SD = 143;
    final static int NPH_PAR_PHOTO_GPRS = 144;
    final static int NPH_GET_PHOTO =  145;

    final static int NPH_PAR_PHOTO_MASK_MODE_SD = 0x3;
    final static int NPH_PAR_PHOTO_MASK_MODE_GPRS = 0xC;

    // DIGITAL OUTPUT
    final static int NPH_SET_PRDO = 150;
    final static int NPH_GET_PRDO = 151;
    final static int NPH_PRDO = 152;

    // MODE ALARM
    final static int NPH_SET_MODALARM = 160;
    final static int NPH_GET_MODALARM = 161;
    final static int NPH_MODALARM = 162;

    // Program cmd for connect server
    final static int NPH_SET_PRIA = 170;
    final static int NPH_GET_PRIA = 171;
    final static int NPH_PRIA = 172;

    // Program parametrs for navigation system
    final static int NPH_SET_PRNAV = 175;
    final static int NPH_GET_PRNAV = 176;
    final static int NPH_PRNAV = 177;

    // Command for read firmware
    final static int NPH_SET_LOADFIRM = 180;

    // Get information about navigator
    final static int NPH_GET_INFO = 185;
    final static int NPH_INFO = 186;

    // Get balance on SIM card
    final static int NPH_GET_BALANCE = 190;
    final static int NPH_BALANCE = 191;

    // Command for set current time
    final static int NPH_SET_CURTIME = 195;

    // Command for Aotoinformer
    final static int NPH_SET_ROUTE_AUTOINFORMER = 200;
    final static int NPH_GET_ROUTE_AUTOINFORMER = 201;
    final static int NPH_ROUTE_AUTOINFORMER = 202;

    // Command for reset internal state
    final static int NPH_RESET_INT_STATE = 205;
    // Bit mask for reset state
    final static int MASK_RESET_VOICE = 1; // Маска для сброса голосового вызова
    final static int MASK_RESET_SOS = 2; // Маска для сброса SOS

    // Command for IMSI SIM code
    final static int NPH_GET_SIM_IMSI = 210;
    final static int NPH_SIM_IMSI = 211;

    // Command for set parameters in roaming
    final static int NPH_GPRS_ROMING = 215;

    // Command for get min navigation
    final static int NPH_GET_NAVINFO = 220;

    // Programm cmd for connect server extended
    final static int NPH_SET_PRIA_EXT = 230;
    final static int NPH_GET_PRIA_EXT = 231;
    final static int NPH_PRIA_EXT = 232;

    // Command for set parameters in roaming Extended
    final static int NPH_GPRS_ROMING_EXT = 235;

    // Programm cmd enable second server
    final static int NPH_SET_SECSERVER = 235;

    // SMS (This command may receive only from sms channel)
    final static int NPH_SET_PRIA_EXT_SMS = 1000;
    final static int NPH_SET_PRNAV_SMS = 1005;
    final static int NPH_SET_LOADFIRM_SMS = 1010;
    final static int NPH_GET_INFO_SMS = 1015;
    final static int NPH_GET_BALANCE_SMS = 1020;
    final static int NPH_RESET_SMS = 1025;
    final static int NPH_ADD_TEL_SMS = 1030;
    final static int NPH_DEL_TEL_SMS = 1031;
    final static int NPH_GPRS_ROMING_EXT_SMS = 1035;
    final static int NPH_GET_NAVINFO_SMS = 1040;
    final static int NPH_SET_SECSERVER_SMS = 1050;

    final static int NPH_SET_PRIA_SMS = 1200;
    final static int NPH_GPRS_ROMING_SMS = 1205;

    /*NPH_SRV_NAVDATA packets*/
    final static int NPH_SND_RESULT = 0;                          //NPH_RESULT
    final static int NPH_SND_HISTORY = 100;
    public final static int NPH_SND_REALTIME = 101;

    /*NPH_SRV_CLIENT_LIST packets*/
    final static int NPH_SCL_RESULT = 0;                          //NPH_RESULT
    final static int NPH_SCL_CLIENT_LIST_REQUEST = 100;
    final static int NPH_SCL_CLIENT_LIST = 101;
    final static int NPH_SCL_CLIENT_STATUS_REQUEST = 102;

    /*NPH_SRV_EXTERNAL_DEVICE packets*/
    final static int NPH_SED_DEVICE_TITLE_DATA = 100;
    final static int NPH_SED_DEVICE_DATA = 101;
    final static int NPH_SED_DEVICE_RESULT = 102;

    /*NPH_SRV_EXTERNAL_DEVICE device address*/
    final static int NPH_SED_ADDR_DISPLAY_DEVICE = 0x0;
    final static int NPH_SED_ADDR_VOICE_DRIVER_DEVICE = 0x10;
    final static int NPH_SED_ADDR_VOICE_DRIVER_PASSANGERS = 0x20;
    final static int NPH_SED_ADDR_INTERNAL_DISPLAY = 0x30;
    final static int NPH_SED_ADDR_EXTERNAL_DISPLAY = 0x40;
    final static int NPH_SED_ADDR_IRMA_DEVICE = 0x50;
    final static int NPH_SED_ADDR_BPKRD_DEVICE = 0x60;
    final static int NPH_SED_ADDR_TEMPERATURE_ON_BOARD = 0x70;
    final static int NPH_SED_ADDR_JPG_CAMERA = 0x80;
    final static int NPH_SED_ADDR_INT_PARAMETERS = 0x90;

    /*NPH_SRV_EXTERNAL_DEVICE type packet*/
    final static int NPH_SED_TYPE_MSG_SCRIPT_DISPLAY = 0x1;
    final static int NPH_SED_TYPE_JPG_FOTO = 0x2;
    final static int NPH_SED_TYPE_VECTOR_MAP = 0x3;
    final static int NPH_SED_TYPE_VOICE_LPC10 = 0x4;
    final static int NPH_SED_TYPE_VOICE_GSM630 = 0x5;
    final static int NPH_SED_TYPE_VOICE_SPEEC = 0x6;
    final static int NPH_SED_TYPE_PAR_REQUEST = 0x7;   // Пакет запроса параметров
    final static int NPH_SED_TYPE_PAR_DATA = 0x8;   // Пакет параметров Если приходит для устройства то это 
                                                          // значит установить, если в АРМ, то ответ на запрос
    final static int NPH_SED_TYPE_PAR_ID = 0x9;   // Пакет ID параметров. Может приходить только к навигатору.
                                                          // На данный пакет навигатор ответит пааетом данных парамтеров

    /*general errors*/
    final static int NPH_RESULT_OK = 0x00000000;
    final static int NPH_RESULT_UNDEFINED = 0xFFFFFFFF;
    final static int NPH_RESULT_BUSY = 1;

    /*service errors*/
    final static int NPH_RESULT_SERVICE_NOT_SUPPORTED = 100;
    final static int NPH_RESULT_SERVICE_NOT_ALLOWED = 101;
    final static int NPH_RESULT_SERVICE_NOT_AVIALABLE = 102;
    //#define NPH_RESULT_SERVICE_BUSY                 103
    final static int NPH_RESULT_SERVICE_NOT_CONSECUTION = 104;
    final static int NPH_RESULT_SERVICE_NOT_DEVICE_ADDRESS = 105;

    /*packet errors*/
    final static int NPH_RESULT_PACKET_NOT_SUPPORTED = 200;
    final static int NPH_RESULT_PACKET_INVALID_SIZE = 201;
    final static int NPH_RESULT_PACKET_INVALID_FORMAT = 202;
    final static int NPH_RESULT_PACKET_INVALID_PARAMETER = 203;
    final static int NPH_RESULT_PACKET_UNEXPECTED = 204;

    /*connection errors*/
    final static int NPH_RESULT_PROTO_VER_NOT_SUPPORTED = 300;
    final static int NPH_RESULT_CLIENT_NOT_REGISTERED = 301;
    final static int NPH_RESULT_CLIENT_TYPE_NOT_SUPPORTED = 302;
    final static int NPH_RESULT_CLIENT_AUTH_FAILED = 303;
    final static int NPH_RESULT_INVALID_ADDRESS = 304;
    final static int NPH_RESULT_CLIENT_ALREADY_REGISTERED = 305;

    /*database errors*/
    final static int NPH_RESULT_DATABASE_QUERY_FAILED = 400;
    final static int NPH_RESULT_DATABASE_DOWN = 401;

    /*message errors*/
    final static int NPH_RESULT_CODEC_NOT_SUPPORTED = 500;
    
}
