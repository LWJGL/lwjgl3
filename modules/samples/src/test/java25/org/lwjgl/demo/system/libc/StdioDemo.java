/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.libc;

import org.lwjgl.system.ffm.*;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.nio.charset.*;
import java.util.*;

import static org.lwjgl.system.ffm.FFM.*;
import static org.lwjgl.system.libc.LibCStdio.*;
import static org.testng.Assert.*;

public final class StdioDemo {

    static {
        ffmConfig(StdioDemo.class, ffmConfigBuilder(MethodHandles.lookup())
            .withSymbolLookup(name -> Optional.of(MemorySegment.ofAddress(switch (name) {
                case "fscanf" -> fscanf;
                case "sscanf" -> sscanf;
                case "fprintf" -> fprintf;
                case "snprintf" -> snprintf;
                default -> throw new UnsupportedOperationException("Unknown symbol: " + name);
            })))
            .build());
    }

    interface MyStdio {
        int fscanf(@FFMPointer long stream, String format, @FFMFirstVariadicArg MemorySegment input);

        int sscanf(String buffer, String format, @FFMFirstVariadicArg MemorySegment input, MemorySegment number);

        @FFMFirstVariadicArg(2)
        int fprintf(@FFMPointer long stream, String format);
        int fprintf(@FFMPointer long stream, String format, @FFMFirstVariadicArg int x, int y, double z, String text);

        int snprintf(MemorySegment buffer, long size, String format, @FFMFirstVariadicArg int x, int y, double z, String text);
    }

    private static final MyStdio stdio = ffmGenerate(MyStdio.class);

    private StdioDemo() {
    }

    static void main() {
        check(stdio.fprintf(stdout, "Please input a word: "));
        check(fflush(stdout));

        try (var arena = Arena.ofConfined()) {
            var input  = arena.allocate(8);
            var number = arena.allocate(ValueLayout.JAVA_INT);
            var output = arena.allocate(256);

            var matched = check(stdio.fscanf(stdin, "%7s", input));
            assertEquals(matched, 1);

            var word = input.getString(0L, StandardCharsets.UTF_8);

            check(stdio.sscanf(word + " 42", "%7s%d", input, number));
            assertEquals(word, input.getString(0L, StandardCharsets.UTF_8));
            assertEquals(42, number.get(ValueLayout.JAVA_INT, 0L));

            check(stdio.fprintf(stdout, "Hello %d|%d|%g world and your word: %0s!\n", 42, 7, 3.14, word));
            check(fflush(stdout));

            check(stdio.snprintf(output, output.byteSize(), "Hello %d|%d|%g world and your word: %0s!\n", 42, 7, 3.14, word));

            assertEquals(
                output.getString(0L, StandardCharsets.UTF_8),
                "Hello " + 42 + "|" + 7 + "|" + 3.14 + " world and your word: " + word + "!\n"
            );
        }
    }

    private static int check(int result) {
        if (result < 0) {
            throw new RuntimeException("I/O error occurred: " + result);
        }
        return result;
    }

}