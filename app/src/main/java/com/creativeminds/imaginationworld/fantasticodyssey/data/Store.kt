package com.creativeminds.imaginationworld.fantasticodyssey.data

object Store {
    const val KEY_GAID = "gaid";
    const val FIREBASE_TOKEN = "firebase_token"
    const val API_KEY = "api_key"
    const val APPMETRICA_KEY = "appmetrica"
    const val APPSFLYER_KEY = "appsflyer_key"
    const val USERX_KEY = "userx_key"
    const val MYTRACKER_KEY = "mytracker_key"
    const val DEEPLINK = "deeplink"
    const val ACTUAL_BACKEND = "actual_backend"
    const val APPSFLYER_DEVICE_ID = "appsFlyerDeviceId"
    const val MYTRACKER_DEVICE_ID = " myTrackerDeviceId"
    const val APPMETRICA_DEVICE_ID = "appMetricaDeviceId"
    const val AFF_SUB_1 = "affsub1"
    const val AFF_SUB_2_MT = "affSub2MT"
    const val AFF_SUB_2_AF = "affSub2AF"
    const val AFF_SUB_3 = "affsub3"
    const val AFF_SUB_5 = "affsub5"
    const val AFF_SUB_2 = "affsub2"
    val dataMap = mutableMapOf(
        Pair(
            API_KEY,
            "SbGtJy5bdouh2WhMisUANikbqRbVA7aHzKSRoUobMRklESC4hnuHv+GSjkEkuYsoNR5E4ZFU9XOW0JFbC1CRQ8a3gc5doOUPUFeiaKThVOhwFyXvOsqrDxLlUKG1UHc2JYxJR6egqBI5cmcT9EgmSmVmLi+EfkD7L2K8UHf2TOneX++5wsbIGyM9x8UB9RwJJhjKsYXBqtikSd7NyZk9hdlkcKk/N4nvDEvZqLE="
        ),
        Pair(APPMETRICA_KEY, "6bd959e6-bbe4-4fdc-a769-70d00abf32ce"),
        Pair(APPSFLYER_KEY, "jLNYzxQAqxAFeturo6YEAD"),
        Pair(USERX_KEY, "304cc7e6-f230-4ec5-92cd-9f8b7d048946"),
        Pair(MYTRACKER_KEY, "34905312693640999434"),
        Pair(
            DEEPLINK,
            "https://play.google.com/store/apps/details?id=com.creativeminds.imaginationworld.fantasticodyssey"
        )
    )
    val deviceId = mutableMapOf<String, String>()
    var requestArguments = ParamsForQuery()
    var actualBackend: Backend? = null
    var dataSubs = mutableMapOf<String, String?>()
}