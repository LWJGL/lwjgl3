/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.util.*;

import static org.lwjgl.system.APIUtil.*;

/** Java 9 version of {@code CheckIntrinsics}. */
public final class CheckIntrinsics {

    static {
        apiLog("Java 9 check intrinsics enabled");
    }

    private CheckIntrinsics() {
    }

    public static int checkIndex(int index, int length) {
        return Objects.checkIndex(index, length);
    }

    public static int checkFromToIndex(int fromIndex, int toIndex, int length) {
        return Objects.checkFromToIndex(fromIndex, toIndex, length);
    }

    public static int checkFromIndexSize(int fromIndex, int size, int length) {
        return Objects.checkFromIndexSize(fromIndex, size, length);
    }


}