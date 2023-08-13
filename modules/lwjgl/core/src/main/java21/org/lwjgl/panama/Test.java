/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.panama;

import org.lwjgl.system.*;
import org.lwjgl.system.libc.*;
import sun.misc.*;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.lang.reflect.*;
import java.nio.*;
import java.util.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.invoke.MethodType.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/*
-XX:+UnlockDiagnosticVMOptions
-XX:+LogCompilation
-XX:+PrintAssembly
-XX:PrintAssemblyOptions=intel
-XX:-TieredCompilation
-XX:-UseCompressedOops
-XX:LogFile=jitwatch.log

-verbose:gc
-XX:+PrintGCDetails
-XX:-DoEscapeAnalysis
 */
public class Test {

    private static final MethodHandle STRLEN_ADDR;

    private static final Unsafe UNSAFE;

    private static final Class<? extends MemorySegment> MEMORY_SEGMENT_CLASS;

    private static final long LENGTH;
    private static final long READONLY;
    private static final long SCOPE;
    private static final long MIN;

    private static final MethodHandle STRLEN;

    static {
        Linker linker = Linker.nativeLinker();

        MemorySegment strlen = linker.defaultLookup()
            .find("strlen")
            .orElseThrow();

        try {
            STRLEN = Pointer.BITS64
                ? linker.downcallHandle(strlen, FunctionDescriptor.of(JAVA_LONG, ADDRESS), Linker.Option.isTrivial())
                : MethodHandles.filterReturnValue(
                linker.downcallHandle(strlen, FunctionDescriptor.of(JAVA_INT, ADDRESS), Linker.Option.isTrivial()),
                MethodHandles.lookup().findStatic(Test.class, "size_t32", methodType(long.class, int.class))
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static long size_t32(int len) {
        return len & 0xFFFF_FFFFL;
    }

    private static void strlen(MemorySegment segment) throws Throwable {
        long len = (long)STRLEN.invokeExact(segment);
        if (len != 5L) {
            throw new IllegalStateException();
        }
    }

    private static void strlen(ByteBuffer buffer) {
        long len = LibCString.strlen(buffer);
        if (len != 5) {
            throw new IllegalStateException();
        }
    }

    static {
        try {
            MethodHandle cat    = MethodHandles.lookup().findVirtual(String.class, "concat", methodType(String.class, String.class));
            MethodHandle length = MethodHandles.lookup().findVirtual(String.class, "length", methodType(int.class));

            System.out.println((String)cat.invokeExact("x", "y")); // xy
            //String result = "x".concat("y");

            MethodHandle filtered = MethodHandles.filterReturnValue(cat, length);

            System.out.println((int)filtered.invokeExact("x", "y")); // 2
            //int length = ("x".concat("y")).length();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        Linker linker = Linker.nativeLinker();

        STRLEN_ADDR = linker.downcallHandle(
            linker.defaultLookup().find("strlen").orElseThrow(),
            FunctionDescriptor.of(ADDRESS, ADDRESS),
            Linker.Option.isTrivial()
        );

        UNSAFE = getUnsafeInstance();

        MemorySegment segment = MemorySegment.ofAddress(-1L)
            .reinterpret(1, Arena.global(), null);

        MEMORY_SEGMENT_CLASS = segment.getClass();

        LENGTH = getLengthOffset();
        READONLY = getReadOnlyOffset();
        SCOPE = getFieldOffsetObject(segment, Arena.global().scope());
        MIN = getAddressOffset();
    }

    public static void main(String[] args) throws Throwable {
        for (int i = 0; i < 10000; i++) {
            System.nanoTime();
        }

        // warmup
        for (int i = 0; i < 100; i++) {
            benchJNIΑlloc(1_000_000);
        }

        var t = System.nanoTime();
        benchJNIΑlloc(100_000_000);
        t = (System.nanoTime() - t) / 10_000_000;
        System.out.println(t / 10.0);
    }

    // 63.1
    private static void benchPanamaAlloc(int iters) throws Throwable {
        for (int i = 0; i < iters; i++) {
            benchPanamaAlloc();
        }
    }

    private static void benchPanamaAlloc() throws Throwable {
        try (var arena = Arena.ofConfined()) {
            var segment = arena.allocateUtf8String("Hello");
            strlen(segment);
        }
    }

    // 3.1
    private static void benchPanamaReuse(int iters) throws Throwable {
        try (var arena = Arena.ofConfined()) {
            var segment = arena.allocateUtf8String("Hello");
            for (int i = 0; i < iters; i++) {
                strlen(segment);
            }
        }
    }

    // 3.1
    private static void benchInteropReuse(int iters) throws Throwable {
        try (var stack = stackPush()) {
            int bytes = stack.nUTF8("Hello", true);

            /*MemorySegment segment = MemorySegment
                .ofAddress(stack.getPointerAddress())
                .reinterpret(bytes, Arena.global(), null);*/

            for (int i = 0; i < iters; i++) {
                benchInteropReuse(stack, bytes);
            }
        }
    }

    private static void benchInteropReuse(MemoryStack stack, int bytes) throws Throwable {
        MemorySegment segment = MemorySegment
            .ofAddress(stack.getPointerAddress())
            .reinterpret(bytes, Arena.global(), null);

        strlen(segment);
    }

    // 5.8
    private static void benchInterop(int iters) throws Throwable {
        try (var stack = stackPush()) {
            for (int i = 0; i < iters; i++) {
                benchInterop(stack);
            }
        }
    }

    private static void benchInterop(MemoryStack stack) throws Throwable {
        try (var frame = stack.push()) {
            int bytes = frame.nUTF8("Hello", true);

            MemorySegment segment = MemorySegment
                .ofAddress(frame.getPointerAddress())
                .reinterpret(bytes, Arena.global(), null);

            //MemorySegment segment = wrap(bytes, Arena.global(), frame.getPointerAddress());

            strlen(segment);
        }
    }

    // 5.3
    private static void benchJNI(int iters) {
        try (MemoryStack stack = stackPush()) {
            for (int i = 0; i < iters; i++) {
                benchJNI(stack);
            }
        }
    }

    private static void benchJNI(MemoryStack stack) {
        try (MemoryStack frame = stack.push()) {
            ByteBuffer buffer = frame.UTF8("Hello");
            strlen(buffer);
        }
    }

    // 4.6
    private static void benchJNIReuse(int iters) {
        try (MemoryStack stack = stackPush()) {
            ByteBuffer buffer = stack.UTF8("Hello");
            for (int i = 0; i < iters; i++) {
                strlen(buffer);
            }
        }
    }

    // 28.7
    private static void benchJNIΑlloc(int iters) {
        try (MemoryStack stack = stackPush()) {
            for (int i = 0; i < iters; i++) {
                benchJNIΑlloc();
            }
        }
    }

    private static void benchJNIΑlloc() {
        var buffer = memUTF8("Hello");
        strlen(buffer);
        memFree(buffer);
    }

    static MemorySegment wrap(int capacity, Arena arena, long address) {
        MemorySegment segment;
        try {
            segment = (MemorySegment)UNSAFE.allocateInstance(MEMORY_SEGMENT_CLASS);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(segment, LENGTH, capacity);
        //UNSAFE.putBoolean(segment, READONLY, false);
        UNSAFE.putObject(segment, SCOPE, arena.scope());
        UNSAFE.putLong(segment, MIN, address);

        return segment;
    }

    private static sun.misc.Unsafe getUnsafeInstance() {
        java.lang.reflect.Field[] fields = sun.misc.Unsafe.class.getDeclaredFields();

        /*
        Different runtimes use different names for the Unsafe singleton,
        so we cannot use .getDeclaredField and we scan instead. For example:

        Oracle: theUnsafe
        PERC : m_unsafe_instance
        Android: THE_ONE
        */
        for (java.lang.reflect.Field field : fields) {
            if (!field.getType().equals(sun.misc.Unsafe.class)) {
                continue;
            }

            int modifiers = field.getModifiers();
            if (!(java.lang.reflect.Modifier.isStatic(modifiers) && java.lang.reflect.Modifier.isFinal(modifiers))) {
                continue;
            }

            try {
                field.setAccessible(true);
                return (sun.misc.Unsafe)field.get(null);
            } catch (Exception ignored) {
            }
            break;
        }

        throw new UnsupportedOperationException("LWJGL requires sun.misc.Unsafe to be available.");
    }

    private static long getFieldOffsetBoolean(Object container, boolean value) {
        return getFieldOffset(container.getClass(), boolean.class, offset -> UNSAFE.getBoolean(container, offset) == value);
    }

    private static long getFieldOffsetInt(Object container, int value) {
        return getFieldOffset(container.getClass(), int.class, offset -> UNSAFE.getInt(container, offset) == value);
    }

    private static long getFieldOffsetLong(Object container, long value) {
        return getFieldOffset(container.getClass(), long.class, offset -> UNSAFE.getLong(container, offset) == value);
    }

    private static long getFieldOffsetObject(Object container, Object value) {
        return getFieldOffset(container.getClass(), value.getClass(), offset -> UNSAFE.getObject(container, offset) == value);
    }

    private static final long MAGIC_LENGTH = 0x0D15EA5_0D15EA5EL;

    private static long getLengthOffset() {
        MemorySegment segment = Objects.requireNonNull(MemorySegment.ofAddress(-1L).reinterpret(MAGIC_LENGTH));
        return getFieldOffsetLong(segment, MAGIC_LENGTH);
    }

    private static long getReadOnlyOffset() {
        MemorySegment segment = Objects.requireNonNull(MemorySegment.ofAddress(-1L).reinterpret(0L)).asReadOnly();
        return getFieldOffsetBoolean(segment, true);
    }

    private static long getAddressOffset() {
        long MAGIC_ADDRESS = 0xDEADBEEF8BADF00DL & (BITS32 ? 0xFFFF_FFFFL : 0xFFFF_FFFF_FFFF_FFFFL);

        MemorySegment segment = Objects.requireNonNull(MemorySegment.ofAddress(MAGIC_ADDRESS).reinterpret(1L));

        return getFieldOffset(segment.getClass(), long.class, offset -> UNSAFE.getLong(segment, offset) == MAGIC_ADDRESS);
    }

    private static long getFieldOffset(Class<?> containerType, Class<?> fieldType, LongPredicate predicate) {
        Class<?> c = containerType;
        while (c != Object.class) {
            Field[] fields = c.getDeclaredFields();
            for (Field field : fields) {
                if (!field.getType().isAssignableFrom(fieldType) || Modifier.isStatic(field.getModifiers()) || field.isSynthetic()) {
                    continue;
                }

                long offset = UNSAFE.objectFieldOffset(field);
                if (predicate.test(offset)) {
                    return offset;
                }
            }
            c = c.getSuperclass();
        }
        throw new UnsupportedOperationException("Failed to find field offset in class.");
    }

}
