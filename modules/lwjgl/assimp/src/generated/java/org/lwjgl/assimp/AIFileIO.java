/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Provided are functions to open and close files. Supply a custom structure to the import function. If you don't, a default implementation is used. Use
 * custom file systems to enable reading from other sources, such as ZIPs or memory locations.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiFileIO {
 *     {@link AIFileOpenProcI aiFileOpenProc} {@link #OpenProc};
 *     {@link AIFileCloseProcI aiFileCloseProc} {@link #CloseProc};
 *     aiUserData {@link #UserData};
 * }</code></pre>
 */
@NativeType("struct aiFileIO")
public class AIFileIO extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OPENPROC,
        CLOSEPROC,
        USERDATA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OPENPROC = layout.offsetof(0);
        CLOSEPROC = layout.offsetof(1);
        USERDATA = layout.offsetof(2);
    }

    /**
     * Creates a {@code AIFileIO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIFileIO(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Function used to open a new file */
    @NativeType("aiFileOpenProc")
    public AIFileOpenProc OpenProc() { return nOpenProc(address()); }
    /** Function used to close an existing file */
    @NativeType("aiFileCloseProc")
    public AIFileCloseProc CloseProc() { return nCloseProc(address()); }
    /** User-defined, opaque data */
    @NativeType("aiUserData")
    public long UserData() { return nUserData(address()); }

    /** Sets the specified value to the {@link #OpenProc} field. */
    public AIFileIO OpenProc(@NativeType("aiFileOpenProc") AIFileOpenProcI value) { nOpenProc(address(), value); return this; }
    /** Sets the specified value to the {@link #CloseProc} field. */
    public AIFileIO CloseProc(@NativeType("aiFileCloseProc") AIFileCloseProcI value) { nCloseProc(address(), value); return this; }
    /** Sets the specified value to the {@link #UserData} field. */
    public AIFileIO UserData(@NativeType("aiUserData") long value) { nUserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIFileIO set(
        AIFileOpenProcI OpenProc,
        AIFileCloseProcI CloseProc,
        long UserData
    ) {
        OpenProc(OpenProc);
        CloseProc(CloseProc);
        UserData(UserData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIFileIO set(AIFileIO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIFileIO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIFileIO malloc() {
        return wrap(AIFileIO.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIFileIO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIFileIO calloc() {
        return wrap(AIFileIO.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIFileIO} instance allocated with {@link BufferUtils}. */
    public static AIFileIO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIFileIO.class, memAddress(container), container);
    }

    /** Returns a new {@code AIFileIO} instance for the specified memory address. */
    public static AIFileIO create(long address) {
        return wrap(AIFileIO.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIFileIO createSafe(long address) {
        return address == NULL ? null : wrap(AIFileIO.class, address);
    }

    /**
     * Returns a new {@link AIFileIO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIFileIO.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIFileIO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIFileIO.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIFileIO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIFileIO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIFileIO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIFileIO.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIFileIO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIFileIO mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIFileIO callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIFileIO mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIFileIO callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIFileIO.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIFileIO.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIFileIO.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIFileIO.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIFileIO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIFileIO malloc(MemoryStack stack) {
        return wrap(AIFileIO.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIFileIO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIFileIO calloc(MemoryStack stack) {
        return wrap(AIFileIO.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIFileIO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIFileIO.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIFileIO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIFileIO.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #OpenProc}. */
    public static AIFileOpenProc nOpenProc(long struct) { return AIFileOpenProc.create(memGetAddress(struct + AIFileIO.OPENPROC)); }
    /** Unsafe version of {@link #CloseProc}. */
    public static AIFileCloseProc nCloseProc(long struct) { return AIFileCloseProc.create(memGetAddress(struct + AIFileIO.CLOSEPROC)); }
    /** Unsafe version of {@link #UserData}. */
    public static long nUserData(long struct) { return memGetAddress(struct + AIFileIO.USERDATA); }

    /** Unsafe version of {@link #OpenProc(AIFileOpenProcI) OpenProc}. */
    public static void nOpenProc(long struct, AIFileOpenProcI value) { memPutAddress(struct + AIFileIO.OPENPROC, value.address()); }
    /** Unsafe version of {@link #CloseProc(AIFileCloseProcI) CloseProc}. */
    public static void nCloseProc(long struct, AIFileCloseProcI value) { memPutAddress(struct + AIFileIO.CLOSEPROC, value.address()); }
    /** Unsafe version of {@link #UserData(long) UserData}. */
    public static void nUserData(long struct, long value) { memPutAddress(struct + AIFileIO.USERDATA, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIFileIO.OPENPROC));
        check(memGetAddress(struct + AIFileIO.CLOSEPROC));
    }

    // -----------------------------------

    /** An array of {@link AIFileIO} structs. */
    public static class Buffer extends StructBuffer<AIFileIO, Buffer> implements NativeResource {

        private static final AIFileIO ELEMENT_FACTORY = AIFileIO.create(-1L);

        /**
         * Creates a new {@code AIFileIO.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIFileIO#SIZEOF}, and its mark will be undefined.
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
        protected AIFileIO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link AIFileIO#OpenProc} field. */
        @NativeType("aiFileOpenProc")
        public AIFileOpenProc OpenProc() { return AIFileIO.nOpenProc(address()); }
        /** @return the value of the {@link AIFileIO#CloseProc} field. */
        @NativeType("aiFileCloseProc")
        public AIFileCloseProc CloseProc() { return AIFileIO.nCloseProc(address()); }
        /** @return the value of the {@link AIFileIO#UserData} field. */
        @NativeType("aiUserData")
        public long UserData() { return AIFileIO.nUserData(address()); }

        /** Sets the specified value to the {@link AIFileIO#OpenProc} field. */
        public AIFileIO.Buffer OpenProc(@NativeType("aiFileOpenProc") AIFileOpenProcI value) { AIFileIO.nOpenProc(address(), value); return this; }
        /** Sets the specified value to the {@link AIFileIO#CloseProc} field. */
        public AIFileIO.Buffer CloseProc(@NativeType("aiFileCloseProc") AIFileCloseProcI value) { AIFileIO.nCloseProc(address(), value); return this; }
        /** Sets the specified value to the {@link AIFileIO#UserData} field. */
        public AIFileIO.Buffer UserData(@NativeType("aiUserData") long value) { AIFileIO.nUserData(address(), value); return this; }

    }

}