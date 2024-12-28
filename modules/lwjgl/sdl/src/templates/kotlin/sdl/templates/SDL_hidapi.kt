/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_hidapi = "SDLHIDAPI".nativeClassSDL("SDL_hidapi") {
    EnumConstant(
        "HID_API_BUS_UNKNOWN".enum("0x00"),
        "HID_API_BUS_USB".enum("0x01"),
        "HID_API_BUS_BLUETOOTH".enum("0x02"),
        "HID_API_BUS_I2C".enum("0x03"),
        "HID_API_BUS_SPI".enum("0x04")
    )

    int("hid_init", void())
    int("hid_exit", void())

    Uint32("hid_device_change_count", void())

    SDL_hid_device_info.p(
        "hid_enumerate",

        unsigned_short("vendor_id"),
        unsigned_short("product_id")
    )

    void(
        "hid_free_enumeration",

        SDL_hid_device_info.p("devs")
    )

    SDL_hid_device.p(
        "hid_open",

        unsigned_short("vendor_id"),
        unsigned_short("product_id"),
        nullable..wchar_t.const.p("serial_number")
    )

    SDL_hid_device.p(
        "hid_open_path",

        charUTF8.const.p("path")
    )

    int(
        "hid_write",

        SDL_hid_device.p("dev"),
        unsigned_char.const.p("data"),
        AutoSize("data")..size_t("length")
    )

    int(
        "hid_read_timeout",

        SDL_hid_device.p("dev"),
        unsigned_char.const.p("data"),
        AutoSize("data")..size_t("length"),
        int("milliseconds")
    )

    int(
        "hid_read",

        SDL_hid_device.p("dev"),
        unsigned_char.p("data"),
        AutoSize("data")..size_t("length")
    )

    int(
        "hid_set_nonblocking",

        SDL_hid_device.p("dev"),
        intb("nonblock")
    )

    int(
        "hid_send_feature_report",

        SDL_hid_device.p("dev"),
        unsigned_char.const.p("data"),
        AutoSize("data")..size_t("length")
    )

    int(
        "hid_get_feature_report",

        SDL_hid_device.p("dev"),
        unsigned_char.p("data"),
        AutoSize("data")..size_t("length")
    )

    int(
        "hid_get_input_report",

        SDL_hid_device.p("dev"),
        unsigned_char.p("data"),
        AutoSize("data")..size_t("length")
    )

    int("hid_close", SDL_hid_device.p("dev"))

    int(
        "hid_get_manufacturer_string",

        SDL_hid_device.p("dev"),
        wchar_t.p("string"),
        AutoSize("string")..size_t("maxlen")
    )

    int(
        "hid_get_product_string",

        SDL_hid_device.p("dev"),
        wchar_t.p("string"),
        AutoSize("string")..size_t("maxlen")
    )

    int(
        "hid_get_serial_number_string",

        SDL_hid_device.p("dev"),
        wchar_t.p("string"),
        AutoSize("string")..size_t("maxlen")
    )

    int(
        "hid_get_indexed_string",

        SDL_hid_device.p("dev"),
        int("string_index"),
        wchar_t.p("string"),
        AutoSize("string")..size_t("maxlen")
    )

    SDL_hid_device_info.p(
        "hid_get_device_info",

        SDL_hid_device.p("dev")
    )

    int(
        "hid_get_report_descriptor",

        SDL_hid_device.p("dev"),
        unsigned_char.p("buf"),
        AutoSize("buf")..size_t("buf_size")
    )

    void("hid_ble_scan", bool("active"))
}