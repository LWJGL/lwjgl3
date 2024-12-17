/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkShaderModuleCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkShaderModuleCreateFlags flags;
 *     size_t codeSize;
 *     uint32_t const * pCode;
 * }}</pre>
 */
public class VkShaderModuleCreateInfo extends Struct<VkShaderModuleCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        CODESIZE,
        PCODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        CODESIZE = layout.offsetof(3);
        PCODE = layout.offsetof(4);
    }

    protected VkShaderModuleCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkShaderModuleCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkShaderModuleCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkShaderModuleCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShaderModuleCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkShaderModuleCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code codeSize} field. */
    @NativeType("size_t")
    public long codeSize() { return ncodeSize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pCode} field. */
    @NativeType("uint32_t const *")
    public ByteBuffer pCode() { return npCode(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkShaderModuleCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO} value to the {@code sType} field. */
    public VkShaderModuleCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkShaderModuleCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkShaderModuleValidationCacheCreateInfoEXT} value to the {@code pNext} chain. */
    public VkShaderModuleCreateInfo pNext(VkShaderModuleValidationCacheCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkValidationFeaturesEXT} value to the {@code pNext} chain. */
    public VkShaderModuleCreateInfo pNext(VkValidationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkShaderModuleCreateInfo flags(@NativeType("VkShaderModuleCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pCode} field. */
    public VkShaderModuleCreateInfo pCode(@NativeType("uint32_t const *") ByteBuffer value) { npCode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkShaderModuleCreateInfo set(
        int sType,
        long pNext,
        int flags,
        ByteBuffer pCode
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pCode(pCode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkShaderModuleCreateInfo set(VkShaderModuleCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkShaderModuleCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkShaderModuleCreateInfo malloc() {
        return new VkShaderModuleCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkShaderModuleCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkShaderModuleCreateInfo calloc() {
        return new VkShaderModuleCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkShaderModuleCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkShaderModuleCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShaderModuleCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkShaderModuleCreateInfo} instance for the specified memory address. */
    public static VkShaderModuleCreateInfo create(long address) {
        return new VkShaderModuleCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkShaderModuleCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkShaderModuleCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkShaderModuleCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkShaderModuleCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkShaderModuleCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderModuleCreateInfo malloc(MemoryStack stack) {
        return new VkShaderModuleCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkShaderModuleCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderModuleCreateInfo calloc(MemoryStack stack) {
        return new VkShaderModuleCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkShaderModuleCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkShaderModuleCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkShaderModuleCreateInfo.FLAGS); }
    /** Unsafe version of {@link #codeSize}. */
    public static long ncodeSize(long struct) { return memGetAddress(struct + VkShaderModuleCreateInfo.CODESIZE); }
    /** Unsafe version of {@link #pCode() pCode}. */
    public static ByteBuffer npCode(long struct) { return memByteBuffer(memGetAddress(struct + VkShaderModuleCreateInfo.PCODE), (int)ncodeSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkShaderModuleCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkShaderModuleCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkShaderModuleCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code codeSize} field of the specified {@code struct}. */
    public static void ncodeSize(long struct, long value) { memPutAddress(struct + VkShaderModuleCreateInfo.CODESIZE, value); }
    /** Unsafe version of {@link #pCode(ByteBuffer) pCode}. */
    public static void npCode(long struct, ByteBuffer value) { memPutAddress(struct + VkShaderModuleCreateInfo.PCODE, memAddress(value)); ncodeSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkShaderModuleCreateInfo.PCODE));
    }

    // -----------------------------------

    /** An array of {@link VkShaderModuleCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkShaderModuleCreateInfo, Buffer> implements NativeResource {

        private static final VkShaderModuleCreateInfo ELEMENT_FACTORY = VkShaderModuleCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkShaderModuleCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShaderModuleCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkShaderModuleCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkShaderModuleCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkShaderModuleCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkShaderModuleCreateFlags")
        public int flags() { return VkShaderModuleCreateInfo.nflags(address()); }
        /** @return the value of the {@code codeSize} field. */
        @NativeType("size_t")
        public long codeSize() { return VkShaderModuleCreateInfo.ncodeSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pCode} field. */
        @NativeType("uint32_t const *")
        public ByteBuffer pCode() { return VkShaderModuleCreateInfo.npCode(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkShaderModuleCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkShaderModuleCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO} value to the {@code sType} field. */
        public VkShaderModuleCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkShaderModuleCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkShaderModuleCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkShaderModuleValidationCacheCreateInfoEXT} value to the {@code pNext} chain. */
        public VkShaderModuleCreateInfo.Buffer pNext(VkShaderModuleValidationCacheCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkValidationFeaturesEXT} value to the {@code pNext} chain. */
        public VkShaderModuleCreateInfo.Buffer pNext(VkValidationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkShaderModuleCreateInfo.Buffer flags(@NativeType("VkShaderModuleCreateFlags") int value) { VkShaderModuleCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pCode} field. */
        public VkShaderModuleCreateInfo.Buffer pCode(@NativeType("uint32_t const *") ByteBuffer value) { VkShaderModuleCreateInfo.npCode(address(), value); return this; }

    }

}