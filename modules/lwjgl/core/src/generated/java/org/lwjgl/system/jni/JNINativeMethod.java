/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jni;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct JNINativeMethod {
 *     char * name;
 *     char * signature;
 *     void * fnPtr;
 * }</code></pre>
 */
public class JNINativeMethod extends Struct<JNINativeMethod> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        SIGNATURE,
        FNPTR;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        SIGNATURE = layout.offsetof(1);
        FNPTR = layout.offsetof(2);
    }

    protected JNINativeMethod(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected JNINativeMethod create(long address, @Nullable ByteBuffer container) {
        return new JNINativeMethod(address, container);
    }

    /**
     * Creates a {@code JNINativeMethod} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public JNINativeMethod(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char *")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code signature} field. */
    @NativeType("char *")
    public ByteBuffer signature() { return nsignature(address()); }
    /** @return the null-terminated string pointed to by the {@code signature} field. */
    @NativeType("char *")
    public String signatureString() { return nsignatureString(address()); }
    /** @return the value of the {@code fnPtr} field. */
    @NativeType("void *")
    public long fnPtr() { return nfnPtr(address()); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public JNINativeMethod name(@NativeType("char *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code signature} field. */
    public JNINativeMethod signature(@NativeType("char *") ByteBuffer value) { nsignature(address(), value); return this; }
    /** Sets the specified value to the {@code fnPtr} field. */
    public JNINativeMethod fnPtr(@NativeType("void *") long value) { nfnPtr(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public JNINativeMethod set(
        ByteBuffer name,
        ByteBuffer signature,
        long fnPtr
    ) {
        name(name);
        signature(signature);
        fnPtr(fnPtr);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public JNINativeMethod set(JNINativeMethod src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code JNINativeMethod} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static JNINativeMethod malloc() {
        return new JNINativeMethod(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code JNINativeMethod} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static JNINativeMethod calloc() {
        return new JNINativeMethod(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code JNINativeMethod} instance allocated with {@link BufferUtils}. */
    public static JNINativeMethod create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new JNINativeMethod(memAddress(container), container);
    }

    /** Returns a new {@code JNINativeMethod} instance for the specified memory address. */
    public static JNINativeMethod create(long address) {
        return new JNINativeMethod(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static JNINativeMethod createSafe(long address) {
        return address == NULL ? null : new JNINativeMethod(address, null);
    }

    /**
     * Returns a new {@link JNINativeMethod.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static JNINativeMethod.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link JNINativeMethod.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static JNINativeMethod.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JNINativeMethod.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static JNINativeMethod.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link JNINativeMethod.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static JNINativeMethod.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static JNINativeMethod.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static JNINativeMethod mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static JNINativeMethod callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static JNINativeMethod mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static JNINativeMethod callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static JNINativeMethod.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static JNINativeMethod.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static JNINativeMethod.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static JNINativeMethod.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code JNINativeMethod} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static JNINativeMethod malloc(MemoryStack stack) {
        return new JNINativeMethod(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code JNINativeMethod} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static JNINativeMethod calloc(MemoryStack stack) {
        return new JNINativeMethod(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link JNINativeMethod.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static JNINativeMethod.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JNINativeMethod.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static JNINativeMethod.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + JNINativeMethod.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + JNINativeMethod.NAME)); }
    /** Unsafe version of {@link #signature}. */
    public static ByteBuffer nsignature(long struct) { return memByteBufferNT1(memGetAddress(struct + JNINativeMethod.SIGNATURE)); }
    /** Unsafe version of {@link #signatureString}. */
    public static String nsignatureString(long struct) { return memUTF8(memGetAddress(struct + JNINativeMethod.SIGNATURE)); }
    /** Unsafe version of {@link #fnPtr}. */
    public static long nfnPtr(long struct) { return memGetAddress(struct + JNINativeMethod.FNPTR); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + JNINativeMethod.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #signature(ByteBuffer) signature}. */
    public static void nsignature(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + JNINativeMethod.SIGNATURE, memAddress(value));
    }
    /** Unsafe version of {@link #fnPtr(long) fnPtr}. */
    public static void nfnPtr(long struct, long value) { memPutAddress(struct + JNINativeMethod.FNPTR, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + JNINativeMethod.NAME));
        check(memGetAddress(struct + JNINativeMethod.SIGNATURE));
        check(memGetAddress(struct + JNINativeMethod.FNPTR));
    }

    // -----------------------------------

    /** An array of {@link JNINativeMethod} structs. */
    public static class Buffer extends StructBuffer<JNINativeMethod, Buffer> implements NativeResource {

        private static final JNINativeMethod ELEMENT_FACTORY = JNINativeMethod.create(-1L);

        /**
         * Creates a new {@code JNINativeMethod.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link JNINativeMethod#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected JNINativeMethod getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char *")
        public ByteBuffer name() { return JNINativeMethod.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char *")
        public String nameString() { return JNINativeMethod.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code signature} field. */
        @NativeType("char *")
        public ByteBuffer signature() { return JNINativeMethod.nsignature(address()); }
        /** @return the null-terminated string pointed to by the {@code signature} field. */
        @NativeType("char *")
        public String signatureString() { return JNINativeMethod.nsignatureString(address()); }
        /** @return the value of the {@code fnPtr} field. */
        @NativeType("void *")
        public long fnPtr() { return JNINativeMethod.nfnPtr(address()); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public JNINativeMethod.Buffer name(@NativeType("char *") ByteBuffer value) { JNINativeMethod.nname(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code signature} field. */
        public JNINativeMethod.Buffer signature(@NativeType("char *") ByteBuffer value) { JNINativeMethod.nsignature(address(), value); return this; }
        /** Sets the specified value to the {@code fnPtr} field. */
        public JNINativeMethod.Buffer fnPtr(@NativeType("void *") long value) { JNINativeMethod.nfnPtr(address(), value); return this; }

    }

}