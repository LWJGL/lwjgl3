/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

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
 * struct LLVMMCJITCompilerOptions {
 *     unsigned int OptLevel;
 *     LLVMCodeModel CodeModel;
 *     LLVMBool NoFramePointerElim;
 *     LLVMBool EnableFastISel;
 *     LLVMMCJITMemoryManagerRef MCJMM;
 * }</code></pre>
 */
@NativeType("struct LLVMMCJITCompilerOptions")
public class LLVMMCJITCompilerOptions extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OPTLEVEL,
        CODEMODEL,
        NOFRAMEPOINTERELIM,
        ENABLEFASTISEL,
        MCJMM;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OPTLEVEL = layout.offsetof(0);
        CODEMODEL = layout.offsetof(1);
        NOFRAMEPOINTERELIM = layout.offsetof(2);
        ENABLEFASTISEL = layout.offsetof(3);
        MCJMM = layout.offsetof(4);
    }

    /**
     * Creates a {@code LLVMMCJITCompilerOptions} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMMCJITCompilerOptions(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code OptLevel} field. */
    @NativeType("unsigned int")
    public int OptLevel() { return nOptLevel(address()); }
    /** @return the value of the {@code CodeModel} field. */
    @NativeType("LLVMCodeModel")
    public int CodeModel() { return nCodeModel(address()); }
    /** @return the value of the {@code NoFramePointerElim} field. */
    @NativeType("LLVMBool")
    public boolean NoFramePointerElim() { return nNoFramePointerElim(address()) != 0; }
    /** @return the value of the {@code EnableFastISel} field. */
    @NativeType("LLVMBool")
    public boolean EnableFastISel() { return nEnableFastISel(address()) != 0; }
    /** @return the value of the {@code MCJMM} field. */
    @NativeType("LLVMMCJITMemoryManagerRef")
    public long MCJMM() { return nMCJMM(address()); }

    /** Sets the specified value to the {@code OptLevel} field. */
    public LLVMMCJITCompilerOptions OptLevel(@NativeType("unsigned int") int value) { nOptLevel(address(), value); return this; }
    /** Sets the specified value to the {@code CodeModel} field. */
    public LLVMMCJITCompilerOptions CodeModel(@NativeType("LLVMCodeModel") int value) { nCodeModel(address(), value); return this; }
    /** Sets the specified value to the {@code NoFramePointerElim} field. */
    public LLVMMCJITCompilerOptions NoFramePointerElim(@NativeType("LLVMBool") boolean value) { nNoFramePointerElim(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code EnableFastISel} field. */
    public LLVMMCJITCompilerOptions EnableFastISel(@NativeType("LLVMBool") boolean value) { nEnableFastISel(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code MCJMM} field. */
    public LLVMMCJITCompilerOptions MCJMM(@NativeType("LLVMMCJITMemoryManagerRef") long value) { nMCJMM(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public LLVMMCJITCompilerOptions set(
        int OptLevel,
        int CodeModel,
        boolean NoFramePointerElim,
        boolean EnableFastISel,
        long MCJMM
    ) {
        OptLevel(OptLevel);
        CodeModel(CodeModel);
        NoFramePointerElim(NoFramePointerElim);
        EnableFastISel(EnableFastISel);
        MCJMM(MCJMM);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LLVMMCJITCompilerOptions set(LLVMMCJITCompilerOptions src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMMCJITCompilerOptions} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMMCJITCompilerOptions malloc() {
        return wrap(LLVMMCJITCompilerOptions.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code LLVMMCJITCompilerOptions} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMMCJITCompilerOptions calloc() {
        return wrap(LLVMMCJITCompilerOptions.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code LLVMMCJITCompilerOptions} instance allocated with {@link BufferUtils}. */
    public static LLVMMCJITCompilerOptions create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(LLVMMCJITCompilerOptions.class, memAddress(container), container);
    }

    /** Returns a new {@code LLVMMCJITCompilerOptions} instance for the specified memory address. */
    public static LLVMMCJITCompilerOptions create(long address) {
        return wrap(LLVMMCJITCompilerOptions.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMMCJITCompilerOptions createSafe(long address) {
        return address == NULL ? null : wrap(LLVMMCJITCompilerOptions.class, address);
    }

    /**
     * Returns a new {@link LLVMMCJITCompilerOptions.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMMCJITCompilerOptions.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMMCJITCompilerOptions.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMMCJITCompilerOptions.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMMCJITCompilerOptions.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMMCJITCompilerOptions.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link LLVMMCJITCompilerOptions.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMMCJITCompilerOptions.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMMCJITCompilerOptions.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static LLVMMCJITCompilerOptions mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static LLVMMCJITCompilerOptions callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static LLVMMCJITCompilerOptions mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static LLVMMCJITCompilerOptions callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static LLVMMCJITCompilerOptions.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static LLVMMCJITCompilerOptions.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static LLVMMCJITCompilerOptions.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static LLVMMCJITCompilerOptions.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code LLVMMCJITCompilerOptions} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMMCJITCompilerOptions malloc(MemoryStack stack) {
        return wrap(LLVMMCJITCompilerOptions.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code LLVMMCJITCompilerOptions} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMMCJITCompilerOptions calloc(MemoryStack stack) {
        return wrap(LLVMMCJITCompilerOptions.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LLVMMCJITCompilerOptions.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMMCJITCompilerOptions.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMMCJITCompilerOptions.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMMCJITCompilerOptions.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #OptLevel}. */
    public static int nOptLevel(long struct) { return UNSAFE.getInt(null, struct + LLVMMCJITCompilerOptions.OPTLEVEL); }
    /** Unsafe version of {@link #CodeModel}. */
    public static int nCodeModel(long struct) { return UNSAFE.getInt(null, struct + LLVMMCJITCompilerOptions.CODEMODEL); }
    /** Unsafe version of {@link #NoFramePointerElim}. */
    public static int nNoFramePointerElim(long struct) { return UNSAFE.getInt(null, struct + LLVMMCJITCompilerOptions.NOFRAMEPOINTERELIM); }
    /** Unsafe version of {@link #EnableFastISel}. */
    public static int nEnableFastISel(long struct) { return UNSAFE.getInt(null, struct + LLVMMCJITCompilerOptions.ENABLEFASTISEL); }
    /** Unsafe version of {@link #MCJMM}. */
    public static long nMCJMM(long struct) { return memGetAddress(struct + LLVMMCJITCompilerOptions.MCJMM); }

    /** Unsafe version of {@link #OptLevel(int) OptLevel}. */
    public static void nOptLevel(long struct, int value) { UNSAFE.putInt(null, struct + LLVMMCJITCompilerOptions.OPTLEVEL, value); }
    /** Unsafe version of {@link #CodeModel(int) CodeModel}. */
    public static void nCodeModel(long struct, int value) { UNSAFE.putInt(null, struct + LLVMMCJITCompilerOptions.CODEMODEL, value); }
    /** Unsafe version of {@link #NoFramePointerElim(boolean) NoFramePointerElim}. */
    public static void nNoFramePointerElim(long struct, int value) { UNSAFE.putInt(null, struct + LLVMMCJITCompilerOptions.NOFRAMEPOINTERELIM, value); }
    /** Unsafe version of {@link #EnableFastISel(boolean) EnableFastISel}. */
    public static void nEnableFastISel(long struct, int value) { UNSAFE.putInt(null, struct + LLVMMCJITCompilerOptions.ENABLEFASTISEL, value); }
    /** Unsafe version of {@link #MCJMM(long) MCJMM}. */
    public static void nMCJMM(long struct, long value) { memPutAddress(struct + LLVMMCJITCompilerOptions.MCJMM, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + LLVMMCJITCompilerOptions.MCJMM));
    }

    // -----------------------------------

    /** An array of {@link LLVMMCJITCompilerOptions} structs. */
    public static class Buffer extends StructBuffer<LLVMMCJITCompilerOptions, Buffer> implements NativeResource {

        private static final LLVMMCJITCompilerOptions ELEMENT_FACTORY = LLVMMCJITCompilerOptions.create(-1L);

        /**
         * Creates a new {@code LLVMMCJITCompilerOptions.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMMCJITCompilerOptions#SIZEOF}, and its mark will be undefined.
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
        protected LLVMMCJITCompilerOptions getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code OptLevel} field. */
        @NativeType("unsigned int")
        public int OptLevel() { return LLVMMCJITCompilerOptions.nOptLevel(address()); }
        /** @return the value of the {@code CodeModel} field. */
        @NativeType("LLVMCodeModel")
        public int CodeModel() { return LLVMMCJITCompilerOptions.nCodeModel(address()); }
        /** @return the value of the {@code NoFramePointerElim} field. */
        @NativeType("LLVMBool")
        public boolean NoFramePointerElim() { return LLVMMCJITCompilerOptions.nNoFramePointerElim(address()) != 0; }
        /** @return the value of the {@code EnableFastISel} field. */
        @NativeType("LLVMBool")
        public boolean EnableFastISel() { return LLVMMCJITCompilerOptions.nEnableFastISel(address()) != 0; }
        /** @return the value of the {@code MCJMM} field. */
        @NativeType("LLVMMCJITMemoryManagerRef")
        public long MCJMM() { return LLVMMCJITCompilerOptions.nMCJMM(address()); }

        /** Sets the specified value to the {@code OptLevel} field. */
        public LLVMMCJITCompilerOptions.Buffer OptLevel(@NativeType("unsigned int") int value) { LLVMMCJITCompilerOptions.nOptLevel(address(), value); return this; }
        /** Sets the specified value to the {@code CodeModel} field. */
        public LLVMMCJITCompilerOptions.Buffer CodeModel(@NativeType("LLVMCodeModel") int value) { LLVMMCJITCompilerOptions.nCodeModel(address(), value); return this; }
        /** Sets the specified value to the {@code NoFramePointerElim} field. */
        public LLVMMCJITCompilerOptions.Buffer NoFramePointerElim(@NativeType("LLVMBool") boolean value) { LLVMMCJITCompilerOptions.nNoFramePointerElim(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code EnableFastISel} field. */
        public LLVMMCJITCompilerOptions.Buffer EnableFastISel(@NativeType("LLVMBool") boolean value) { LLVMMCJITCompilerOptions.nEnableFastISel(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code MCJMM} field. */
        public LLVMMCJITCompilerOptions.Buffer MCJMM(@NativeType("LLVMMCJITMemoryManagerRef") long value) { LLVMMCJITCompilerOptions.nMCJMM(address(), value); return this; }

    }

}