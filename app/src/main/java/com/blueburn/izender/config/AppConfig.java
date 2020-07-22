package com.blueburn.izender.config;

public class AppConfig
{
    public final static int
            SERVER_PORT_COMMUNICATION = 1128,
            SERVER_PORT_SEAMLESS = 58762,
            SERVER_PORT_WEBSHARE = 58732,
            SERVER_PORT_UPDATE_CHANNEL = 58765,
            DEFAULT_SOCKET_TIMEOUT = 5000,
            DEFAULT_SOCKET_TIMEOUT_LARGE = 40000,
            DEFAULT_NOTIFICATION_DELAY = 2000,
            SUPPORTED_MIN_VERSION = 62,
            NICKNAME_LENGTH_MAX = 32,
            BUFFER_LENGTH_DEFAULT = 8096,
            BUFFER_LENGTH_SMALL = 1024,
            DELAY_CHECK_FOR_UPDATES = 21600,
            PHOTO_SCALE_FACTOR = 100,
            WEB_SHARE_CONNECTION_MAX = 20;

    public final static String
            EMAIL_DEVELOPER = "info@izender.in",
            URI_REPO_APP_UPDATE = "https://api.github.com/repos/blueburnindia/I-Zender/releases",
            URI_REPO_APP_CONTRIBUTORS = "https://api.github.com/repos/blueburnindia/I-Zender/contributors",
            URI_GOOGLE_PLAY = "https://play.google.com/store/apps/details?id=com.blueburn.izender",
            URI_REPO_APP = "https://izender.in",
            URI_REPO_ORG = "https://blueburn.in",
            URI_GITHUB_PROFILE = "https://github.com/%s",
            URI_TRANSLATE = "https://github.com/blueburnindia/I-Zender/wiki/Language-contribution",
            URI_TELEGRAM_CHANNEL = "https://t.me/blueburn",
            PREFIX_ACCESS_POINT = "TS_",
            EXT_FILE_PART = "tshare",
            NETWORK_INTERFACE_WIFI = "wlan0",
            NDS_COMM_SERVICE_NAME = "TSComm",
            NDS_COMM_SERVICE_TYPE = "_tscomm._tcp.",
            KEY_GOOGLE_PUBLIC = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuW/uIt6FBs/BR1Ad3YsybgI8NIt6rwvyJXny+ypEGDwJfIS0obMMKEyoBQAcv97S8b/EP33bIlDdaS09O5wAnKNuetEvCMjz6su8jiyFaj9Wn9SJkJ4qD6MRXWg63qMDMy1CDhf5o3GRwldMOW2hf4Qobfi5IBVQE0LJIqVjMOt0ZqR3Yg3KeJ3HuEx6SpfuaEqY0KDOsQzc7+/tmdVJ7mKttkdRgnuAPYnFnLIkQMx+z7f5bTbKLbGQ8/U0cu5+8xXpWcrVJdE94RxvH1j6q1pUdtwwgDnwhF42t84G7/rdPFuXlPqdgQQxQygVdiTm0dkVsU0puh/b2nvMBuFvuQIDAQAB";

    public final static String[] DEFAULT_DISABLED_INTERFACES = new String[]{"rmnet"};

}
