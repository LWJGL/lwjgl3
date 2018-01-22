/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal;

import javax.annotation.*;
import java.nio.*;
import java.util.*;

import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.system.MemoryUtil.*;

/** OpenAL utilities. */
public final class ALUtil {

    private ALUtil() {
    }

    /**
     * Obtains string values from ALC. This is a custom implementation for those tokens that return a list of strings instead of a single string.
     *
     * @param deviceHandle the device to query
     * @param token        the information to query. One of:<br>{@link ALC11#ALC_ALL_DEVICES_SPECIFIER}, {@link ALC11#ALC_CAPTURE_DEVICE_SPECIFIER}
     */
    @Nullable
    public static List<String> getStringList(long deviceHandle, int token) {
        long __result = nalcGetString(deviceHandle, token);
        if (__result == NULL) {
            return null;
        }

        ByteBuffer buffer = memByteBuffer(__result, Integer.MAX_VALUE);

        List<String> strings = new ArrayList<>();

        int offset = 0;
        while (true) {
            if (buffer.get() == 0) {
                int limit = buffer.position() - 1;
                if (limit == offset) { // Previous char was also a \0 == end of list.
                    break;
                }

                strings.add(memUTF8(buffer, limit - offset, offset));
                offset = buffer.position();
            }
        }

        return strings;
    }

}
