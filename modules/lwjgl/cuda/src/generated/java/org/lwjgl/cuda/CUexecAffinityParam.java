/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Execution Affinity Parameters.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUexecAffinityParam {
 *     CUexecAffinityType type;
 *     union {
 *         {@link CUexecAffinitySmCount CUexecAffinitySmCount} {@link #param_smCount smCount};
 *     } param;
 * }</code></pre>
 */
public class CUexecAffinityParam extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        PARAM,
            PARAM_SMCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __union(
                __member(CUexecAffinitySmCount.SIZEOF, CUexecAffinitySmCount.ALIGNOF)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        PARAM = layout.offsetof(1);
            PARAM_SMCOUNT = layout.offsetof(2);
    }

    /**
     * Creates a {@code CUexecAffinityParam} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUexecAffinityParam(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("CUexecAffinityType")
    public int type() { return ntype(address()); }
    /** value for {@link CU#CU_EXEC_AFFINITY_TYPE_SM_COUNT EXEC_AFFINITY_TYPE_SM_COUNT} */
    public CUexecAffinitySmCount param_smCount() { return nparam_smCount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public CUexecAffinityParam type(@NativeType("CUexecAffinityType") int value) { ntype(address(), value); return this; }
    /** Copies the specified {@link CUexecAffinitySmCount} to the {@link #param_smCount} field. */
    public CUexecAffinityParam param_smCount(CUexecAffinitySmCount value) { nparam_smCount(address(), value); return this; }
    /** Passes the {@link #param_smCount} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUexecAffinityParam param_smCount(java.util.function.Consumer<CUexecAffinitySmCount> consumer) { consumer.accept(param_smCount()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUexecAffinityParam set(CUexecAffinityParam src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUexecAffinityParam} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUexecAffinityParam malloc() {
        return wrap(CUexecAffinityParam.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUexecAffinityParam} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUexecAffinityParam calloc() {
        return wrap(CUexecAffinityParam.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUexecAffinityParam} instance allocated with {@link BufferUtils}. */
    public static CUexecAffinityParam create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUexecAffinityParam.class, memAddress(container), container);
    }

    /** Returns a new {@code CUexecAffinityParam} instance for the specified memory address. */
    public static CUexecAffinityParam create(long address) {
        return wrap(CUexecAffinityParam.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUexecAffinityParam createSafe(long address) {
        return address == NULL ? null : wrap(CUexecAffinityParam.class, address);
    }

    /**
     * Returns a new {@link CUexecAffinityParam.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUexecAffinityParam.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUexecAffinityParam.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUexecAffinityParam.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUexecAffinityParam.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUexecAffinityParam.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUexecAffinityParam.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUexecAffinityParam.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUexecAffinityParam.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CUexecAffinityParam} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUexecAffinityParam malloc(MemoryStack stack) {
        return wrap(CUexecAffinityParam.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUexecAffinityParam} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUexecAffinityParam calloc(MemoryStack stack) {
        return wrap(CUexecAffinityParam.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUexecAffinityParam.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUexecAffinityParam.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUexecAffinityParam.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUexecAffinityParam.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + CUexecAffinityParam.TYPE); }
    /** Unsafe version of {@link #param_smCount}. */
    public static CUexecAffinitySmCount nparam_smCount(long struct) { return CUexecAffinitySmCount.create(struct + CUexecAffinityParam.PARAM_SMCOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + CUexecAffinityParam.TYPE, value); }
    /** Unsafe version of {@link #param_smCount(CUexecAffinitySmCount) param_smCount}. */
    public static void nparam_smCount(long struct, CUexecAffinitySmCount value) { memCopy(value.address(), struct + CUexecAffinityParam.PARAM_SMCOUNT, CUexecAffinitySmCount.SIZEOF); }

    // -----------------------------------

    /** An array of {@link CUexecAffinityParam} structs. */
    public static class Buffer extends StructBuffer<CUexecAffinityParam, Buffer> implements NativeResource {

        private static final CUexecAffinityParam ELEMENT_FACTORY = CUexecAffinityParam.create(-1L);

        /**
         * Creates a new {@code CUexecAffinityParam.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUexecAffinityParam#SIZEOF}, and its mark will be undefined.
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
        protected CUexecAffinityParam getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("CUexecAffinityType")
        public int type() { return CUexecAffinityParam.ntype(address()); }
        /** @return a {@link CUexecAffinitySmCount} view of the {@link CUexecAffinityParam#param_smCount} field. */
        public CUexecAffinitySmCount param_smCount() { return CUexecAffinityParam.nparam_smCount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public CUexecAffinityParam.Buffer type(@NativeType("CUexecAffinityType") int value) { CUexecAffinityParam.ntype(address(), value); return this; }
        /** Copies the specified {@link CUexecAffinitySmCount} to the {@link CUexecAffinityParam#param_smCount} field. */
        public CUexecAffinityParam.Buffer param_smCount(CUexecAffinitySmCount value) { CUexecAffinityParam.nparam_smCount(address(), value); return this; }
        /** Passes the {@link CUexecAffinityParam#param_smCount} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUexecAffinityParam.Buffer param_smCount(java.util.function.Consumer<CUexecAffinitySmCount> consumer) { consumer.accept(param_smCount()); return this; }

    }

}