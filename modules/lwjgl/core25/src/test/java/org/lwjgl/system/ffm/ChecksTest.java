/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;
import org.testng.annotations.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

import static org.lwjgl.system.ffm.FFM.*;
import static org.testng.Assert.*;

@NullMarked
@Test
public class ChecksTest {

    static {
        ffmConfig(ChecksTest.class, ffmConfigBuilder(MethodHandles.lookup())
            .withSymbolLookup(Linker.nativeLinker().defaultLookup())
            .build());
    }

    interface MyStdlib {
        // neither null nor MemorySegment.NULL allowed
        void free(MemorySegment ptr);

        // null converted to MemorySegment.NULL automatically
        @FFMName("free")
        void freeNullable(@Nullable MemorySegment ptr);

        // null not allowed, but MemorySegment.NULL is
        @FFMName("free")
        void freeFFMNullable(@FFMNullable MemorySegment ptr);
    }

    public void testNullable() {
        var stdlib = ffmGenerate(MyStdlib.class);

        assertThrows(NullPointerException.class, () -> {
            //noinspection DataFlowIssue
            stdlib.free(null);
        });
        assertThrows(IllegalArgumentException.class, () -> stdlib.free(MemorySegment.NULL));
        assertThrows(IllegalArgumentException.class, () -> stdlib.free(MemorySegment.ofAddress(0L).reinterpret(100L)));

        stdlib.freeNullable(null);
        stdlib.freeNullable(MemorySegment.NULL);
        stdlib.freeNullable(MemorySegment.ofAddress(0L).reinterpret(100L));

        assertThrows(NullPointerException.class, () -> {
            //noinspection DataFlowIssue
            stdlib.freeFFMNullable(null);
        });
        stdlib.freeFFMNullable(MemorySegment.NULL);
        stdlib.freeFFMNullable(MemorySegment.ofAddress(0L).reinterpret(100L));
    }

}