/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.testng.annotations.*;

import javax.annotation.*;

import static org.lwjgl.system.APIUtil.*;
import static org.testng.Assert.*;

@Test
public class APIUtilTest {

    public void testParse() {
        test("1.2", 1, 2, null, null);
        test("1.2.12345", 1, 2, "12345", null);
        test("1.2.12345 LWJGL-123", 1, 2, "12345", "LWJGL-123");
        test("The API 1.2.12345 LWJGL-123", 1, 2, "12345", "LWJGL-123");
        test("The API 1.2.12345 LWJGL-123\n", 1, 2, "12345", "LWJGL-123");
        test("The API 1.2.12345 LWJGL-123 \n", 1, 2, "12345", "LWJGL-123");
        test("The API 1.2.12345 LWJGL-123\n ", 1, 2, "12345", "LWJGL-123");
        test("The API 1.2.12345 LWJGL-123\n1.2.3.4.5", 1, 2, "12345", "LWJGL-123\n1.2.3.4.5");
        test("The API 1.2.12345 LWJGL-123\n1.2.3.4.5\n", 1, 2, "12345", "LWJGL-123\n1.2.3.4.5");
        test("The API 1.2.12345 LWJGL-123\n1.2.3.4.5\n ", 1, 2, "12345", "LWJGL-123\n1.2.3.4.5");
        test("The API 1.2.12345 LWJGL-123\n1.2.3.4.5 \n", 1, 2, "12345", "LWJGL-123\n1.2.3.4.5");

        expectThrows(IllegalArgumentException.class, () -> {
            test("The\nAPI 1.2.12345 LWJGL-123", 1, 2, "12345", "LWJGL-123");
        });
        expectThrows(IllegalArgumentException.class, () -> {
            test("The #1 API 1.2.12345 LWJGL-123", 1, 2, "12345", "LWJGL-123");
        });
    }

    private static void test(String versionString, int major, int minor, @Nullable String revision, @Nullable String implementation) {
        APIVersion version = apiParseVersion(versionString);

        assertEquals(version.major, major);
        assertEquals(version.minor, minor);
        assertEquals(version.revision, revision);
        assertEquals(version.implementation, implementation);
    }
}
