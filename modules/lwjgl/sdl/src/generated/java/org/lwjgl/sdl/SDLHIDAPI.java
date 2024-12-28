/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLHIDAPI {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            hid_init                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_init"),
            hid_exit                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_exit"),
            hid_device_change_count      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_device_change_count"),
            hid_enumerate                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_enumerate"),
            hid_free_enumeration         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_free_enumeration"),
            hid_open                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_open"),
            hid_open_path                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_open_path"),
            hid_write                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_write"),
            hid_read_timeout             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_read_timeout"),
            hid_read                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_read"),
            hid_set_nonblocking          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_set_nonblocking"),
            hid_send_feature_report      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_send_feature_report"),
            hid_get_feature_report       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_feature_report"),
            hid_get_input_report         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_input_report"),
            hid_close                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_close"),
            hid_get_manufacturer_string  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_manufacturer_string"),
            hid_get_product_string       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_product_string"),
            hid_get_serial_number_string = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_serial_number_string"),
            hid_get_indexed_string       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_indexed_string"),
            hid_get_device_info          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_device_info"),
            hid_get_report_descriptor    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_get_report_descriptor"),
            hid_ble_scan                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_hid_ble_scan");

    }

    public static final int
        SDL_HID_API_BUS_UNKNOWN   = 0x00,
        SDL_HID_API_BUS_USB       = 0x01,
        SDL_HID_API_BUS_BLUETOOTH = 0x02,
        SDL_HID_API_BUS_I2C       = 0x03,
        SDL_HID_API_BUS_SPI       = 0x04;

    protected SDLHIDAPI() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_hid_init ] ---

    /** {@code int SDL_hid_init(void)} */
    public static int SDL_hid_init() {
        long __functionAddress = Functions.hid_init;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_hid_exit ] ---

    /** {@code int SDL_hid_exit(void)} */
    public static int SDL_hid_exit() {
        long __functionAddress = Functions.hid_exit;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_hid_device_change_count ] ---

    /** {@code Uint32 SDL_hid_device_change_count(void)} */
    @NativeType("Uint32")
    public static int SDL_hid_device_change_count() {
        long __functionAddress = Functions.hid_device_change_count;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_hid_enumerate ] ---

    /** {@code SDL_hid_device_info * SDL_hid_enumerate(unsigned short vendor_id, unsigned short product_id)} */
    public static long nSDL_hid_enumerate(short vendor_id, short product_id) {
        long __functionAddress = Functions.hid_enumerate;
        return invokeCCP(vendor_id, product_id, __functionAddress);
    }

    /** {@code SDL_hid_device_info * SDL_hid_enumerate(unsigned short vendor_id, unsigned short product_id)} */
    @NativeType("SDL_hid_device_info *")
    public static @Nullable SDL_hid_device_info SDL_hid_enumerate(@NativeType("unsigned short") short vendor_id, @NativeType("unsigned short") short product_id) {
        long __result = nSDL_hid_enumerate(vendor_id, product_id);
        return SDL_hid_device_info.createSafe(__result);
    }

    // --- [ SDL_hid_free_enumeration ] ---

    /** {@code void SDL_hid_free_enumeration(SDL_hid_device_info * devs)} */
    public static void nSDL_hid_free_enumeration(long devs) {
        long __functionAddress = Functions.hid_free_enumeration;
        invokePV(devs, __functionAddress);
    }

    /** {@code void SDL_hid_free_enumeration(SDL_hid_device_info * devs)} */
    public static void SDL_hid_free_enumeration(@NativeType("SDL_hid_device_info *") SDL_hid_device_info devs) {
        nSDL_hid_free_enumeration(devs.address());
    }

    // --- [ SDL_hid_open ] ---

    /** {@code SDL_hid_device * SDL_hid_open(unsigned short vendor_id, unsigned short product_id, wchar_t const * serial_number)} */
    public static long nSDL_hid_open(short vendor_id, short product_id, long serial_number) {
        long __functionAddress = Functions.hid_open;
        return invokeCCPP(vendor_id, product_id, serial_number, __functionAddress);
    }

    /** {@code SDL_hid_device * SDL_hid_open(unsigned short vendor_id, unsigned short product_id, wchar_t const * serial_number)} */
    @NativeType("SDL_hid_device *")
    public static long SDL_hid_open(@NativeType("unsigned short") short vendor_id, @NativeType("unsigned short") short product_id, @NativeType("wchar_t const *") @Nullable ByteBuffer serial_number) {
        if (CHECKS) {
            checkNT2Safe(serial_number);
        }
        return nSDL_hid_open(vendor_id, product_id, memAddressSafe(serial_number));
    }

    /** {@code SDL_hid_device * SDL_hid_open(unsigned short vendor_id, unsigned short product_id, wchar_t const * serial_number)} */
    @NativeType("SDL_hid_device *")
    public static long SDL_hid_open(@NativeType("unsigned short") short vendor_id, @NativeType("unsigned short") short product_id, @NativeType("wchar_t const *") @Nullable CharSequence serial_number) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16Safe(serial_number, true);
            long serial_numberEncoded = serial_number == null ? NULL : stack.getPointerAddress();
            return nSDL_hid_open(vendor_id, product_id, serial_numberEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_hid_open_path ] ---

    /** {@code SDL_hid_device * SDL_hid_open_path(char const * path)} */
    public static long nSDL_hid_open_path(long path) {
        long __functionAddress = Functions.hid_open_path;
        return invokePP(path, __functionAddress);
    }

    /** {@code SDL_hid_device * SDL_hid_open_path(char const * path)} */
    @NativeType("SDL_hid_device *")
    public static long SDL_hid_open_path(@NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_hid_open_path(memAddress(path));
    }

    /** {@code SDL_hid_device * SDL_hid_open_path(char const * path)} */
    @NativeType("SDL_hid_device *")
    public static long SDL_hid_open_path(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_hid_open_path(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_hid_write ] ---

    /** {@code int SDL_hid_write(SDL_hid_device * dev, unsigned char const * data, size_t length)} */
    public static int nSDL_hid_write(long dev, long data, long length) {
        long __functionAddress = Functions.hid_write;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, data, length, __functionAddress);
    }

    /** {@code int SDL_hid_write(SDL_hid_device * dev, unsigned char const * data, size_t length)} */
    public static int SDL_hid_write(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char const *") ByteBuffer data) {
        return nSDL_hid_write(dev, memAddress(data), data.remaining());
    }

    // --- [ SDL_hid_read_timeout ] ---

    /** {@code int SDL_hid_read_timeout(SDL_hid_device * dev, unsigned char const * data, size_t length, int milliseconds)} */
    public static int nSDL_hid_read_timeout(long dev, long data, long length, int milliseconds) {
        long __functionAddress = Functions.hid_read_timeout;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, data, length, milliseconds, __functionAddress);
    }

    /** {@code int SDL_hid_read_timeout(SDL_hid_device * dev, unsigned char const * data, size_t length, int milliseconds)} */
    public static int SDL_hid_read_timeout(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char const *") ByteBuffer data, int milliseconds) {
        return nSDL_hid_read_timeout(dev, memAddress(data), data.remaining(), milliseconds);
    }

    // --- [ SDL_hid_read ] ---

    /** {@code int SDL_hid_read(SDL_hid_device * dev, unsigned char * data, size_t length)} */
    public static int nSDL_hid_read(long dev, long data, long length) {
        long __functionAddress = Functions.hid_read;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, data, length, __functionAddress);
    }

    /** {@code int SDL_hid_read(SDL_hid_device * dev, unsigned char * data, size_t length)} */
    public static int SDL_hid_read(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char *") ByteBuffer data) {
        return nSDL_hid_read(dev, memAddress(data), data.remaining());
    }

    // --- [ SDL_hid_set_nonblocking ] ---

    /** {@code int SDL_hid_set_nonblocking(SDL_hid_device * dev, int nonblock)} */
    public static int SDL_hid_set_nonblocking(@NativeType("SDL_hid_device *") long dev, @NativeType("int") boolean nonblock) {
        long __functionAddress = Functions.hid_set_nonblocking;
        if (CHECKS) {
            check(dev);
        }
        return invokePI(dev, nonblock ? 1 : 0, __functionAddress);
    }

    // --- [ SDL_hid_send_feature_report ] ---

    /** {@code int SDL_hid_send_feature_report(SDL_hid_device * dev, unsigned char const * data, size_t length)} */
    public static int nSDL_hid_send_feature_report(long dev, long data, long length) {
        long __functionAddress = Functions.hid_send_feature_report;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, data, length, __functionAddress);
    }

    /** {@code int SDL_hid_send_feature_report(SDL_hid_device * dev, unsigned char const * data, size_t length)} */
    public static int SDL_hid_send_feature_report(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char const *") ByteBuffer data) {
        return nSDL_hid_send_feature_report(dev, memAddress(data), data.remaining());
    }

    // --- [ SDL_hid_get_feature_report ] ---

    /** {@code int SDL_hid_get_feature_report(SDL_hid_device * dev, unsigned char * data, size_t length)} */
    public static int nSDL_hid_get_feature_report(long dev, long data, long length) {
        long __functionAddress = Functions.hid_get_feature_report;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, data, length, __functionAddress);
    }

    /** {@code int SDL_hid_get_feature_report(SDL_hid_device * dev, unsigned char * data, size_t length)} */
    public static int SDL_hid_get_feature_report(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char *") ByteBuffer data) {
        return nSDL_hid_get_feature_report(dev, memAddress(data), data.remaining());
    }

    // --- [ SDL_hid_get_input_report ] ---

    /** {@code int SDL_hid_get_input_report(SDL_hid_device * dev, unsigned char * data, size_t length)} */
    public static int nSDL_hid_get_input_report(long dev, long data, long length) {
        long __functionAddress = Functions.hid_get_input_report;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, data, length, __functionAddress);
    }

    /** {@code int SDL_hid_get_input_report(SDL_hid_device * dev, unsigned char * data, size_t length)} */
    public static int SDL_hid_get_input_report(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char *") ByteBuffer data) {
        return nSDL_hid_get_input_report(dev, memAddress(data), data.remaining());
    }

    // --- [ SDL_hid_close ] ---

    /** {@code int SDL_hid_close(SDL_hid_device * dev)} */
    public static int SDL_hid_close(@NativeType("SDL_hid_device *") long dev) {
        long __functionAddress = Functions.hid_close;
        if (CHECKS) {
            check(dev);
        }
        return invokePI(dev, __functionAddress);
    }

    // --- [ SDL_hid_get_manufacturer_string ] ---

    /** {@code int SDL_hid_get_manufacturer_string(SDL_hid_device * dev, wchar_t * string, size_t maxlen)} */
    public static int nSDL_hid_get_manufacturer_string(long dev, long string, long maxlen) {
        long __functionAddress = Functions.hid_get_manufacturer_string;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, string, maxlen, __functionAddress);
    }

    /** {@code int SDL_hid_get_manufacturer_string(SDL_hid_device * dev, wchar_t * string, size_t maxlen)} */
    public static int SDL_hid_get_manufacturer_string(@NativeType("SDL_hid_device *") long dev, @NativeType("wchar_t *") ByteBuffer string) {
        return nSDL_hid_get_manufacturer_string(dev, memAddress(string), Integer.toUnsignedLong(string.remaining()) >> 1);
    }

    // --- [ SDL_hid_get_product_string ] ---

    /** {@code int SDL_hid_get_product_string(SDL_hid_device * dev, wchar_t * string, size_t maxlen)} */
    public static int nSDL_hid_get_product_string(long dev, long string, long maxlen) {
        long __functionAddress = Functions.hid_get_product_string;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, string, maxlen, __functionAddress);
    }

    /** {@code int SDL_hid_get_product_string(SDL_hid_device * dev, wchar_t * string, size_t maxlen)} */
    public static int SDL_hid_get_product_string(@NativeType("SDL_hid_device *") long dev, @NativeType("wchar_t *") ByteBuffer string) {
        return nSDL_hid_get_product_string(dev, memAddress(string), Integer.toUnsignedLong(string.remaining()) >> 1);
    }

    // --- [ SDL_hid_get_serial_number_string ] ---

    /** {@code int SDL_hid_get_serial_number_string(SDL_hid_device * dev, wchar_t * string, size_t maxlen)} */
    public static int nSDL_hid_get_serial_number_string(long dev, long string, long maxlen) {
        long __functionAddress = Functions.hid_get_serial_number_string;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, string, maxlen, __functionAddress);
    }

    /** {@code int SDL_hid_get_serial_number_string(SDL_hid_device * dev, wchar_t * string, size_t maxlen)} */
    public static int SDL_hid_get_serial_number_string(@NativeType("SDL_hid_device *") long dev, @NativeType("wchar_t *") ByteBuffer string) {
        return nSDL_hid_get_serial_number_string(dev, memAddress(string), Integer.toUnsignedLong(string.remaining()) >> 1);
    }

    // --- [ SDL_hid_get_indexed_string ] ---

    /** {@code int SDL_hid_get_indexed_string(SDL_hid_device * dev, int string_index, wchar_t * string, size_t maxlen)} */
    public static int nSDL_hid_get_indexed_string(long dev, int string_index, long string, long maxlen) {
        long __functionAddress = Functions.hid_get_indexed_string;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, string_index, string, maxlen, __functionAddress);
    }

    /** {@code int SDL_hid_get_indexed_string(SDL_hid_device * dev, int string_index, wchar_t * string, size_t maxlen)} */
    public static int SDL_hid_get_indexed_string(@NativeType("SDL_hid_device *") long dev, int string_index, @NativeType("wchar_t *") ByteBuffer string) {
        return nSDL_hid_get_indexed_string(dev, string_index, memAddress(string), Integer.toUnsignedLong(string.remaining()) >> 1);
    }

    // --- [ SDL_hid_get_device_info ] ---

    /** {@code SDL_hid_device_info * SDL_hid_get_device_info(SDL_hid_device * dev)} */
    public static long nSDL_hid_get_device_info(long dev) {
        long __functionAddress = Functions.hid_get_device_info;
        if (CHECKS) {
            check(dev);
        }
        return invokePP(dev, __functionAddress);
    }

    /** {@code SDL_hid_device_info * SDL_hid_get_device_info(SDL_hid_device * dev)} */
    @NativeType("SDL_hid_device_info *")
    public static @Nullable SDL_hid_device_info SDL_hid_get_device_info(@NativeType("SDL_hid_device *") long dev) {
        long __result = nSDL_hid_get_device_info(dev);
        return SDL_hid_device_info.createSafe(__result);
    }

    // --- [ SDL_hid_get_report_descriptor ] ---

    /** {@code int SDL_hid_get_report_descriptor(SDL_hid_device * dev, unsigned char * buf, size_t buf_size)} */
    public static int nSDL_hid_get_report_descriptor(long dev, long buf, long buf_size) {
        long __functionAddress = Functions.hid_get_report_descriptor;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, buf, buf_size, __functionAddress);
    }

    /** {@code int SDL_hid_get_report_descriptor(SDL_hid_device * dev, unsigned char * buf, size_t buf_size)} */
    public static int SDL_hid_get_report_descriptor(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char *") ByteBuffer buf) {
        return nSDL_hid_get_report_descriptor(dev, memAddress(buf), buf.remaining());
    }

    // --- [ SDL_hid_ble_scan ] ---

    /** {@code void SDL_hid_ble_scan(bool active)} */
    public static void SDL_hid_ble_scan(@NativeType("bool") boolean active) {
        long __functionAddress = Functions.hid_ble_scan;
        invokeV(active, __functionAddress);
    }

}