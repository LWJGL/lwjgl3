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
 * struct VkGeneratedCommandsShaderInfoEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t shaderCount;
 *     VkShaderEXT const * pShaders;
 * }}</pre>
 */
public class VkGeneratedCommandsShaderInfoEXT extends Struct<VkGeneratedCommandsShaderInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERCOUNT,
        PSHADERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERCOUNT = layout.offsetof(2);
        PSHADERS = layout.offsetof(3);
    }

    protected VkGeneratedCommandsShaderInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGeneratedCommandsShaderInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkGeneratedCommandsShaderInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkGeneratedCommandsShaderInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeneratedCommandsShaderInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code shaderCount} field. */
    @NativeType("uint32_t")
    public int shaderCount() { return nshaderCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pShaders} field. */
    @NativeType("VkShaderEXT const *")
    public LongBuffer pShaders() { return npShaders(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGeneratedCommandsShaderInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT} value to the {@code sType} field. */
    public VkGeneratedCommandsShaderInfoEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGeneratedCommandsShaderInfoEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pShaders} field. */
    public VkGeneratedCommandsShaderInfoEXT pShaders(@NativeType("VkShaderEXT const *") LongBuffer value) { npShaders(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeneratedCommandsShaderInfoEXT set(
        int sType,
        long pNext,
        LongBuffer pShaders
    ) {
        sType(sType);
        pNext(pNext);
        pShaders(pShaders);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGeneratedCommandsShaderInfoEXT set(VkGeneratedCommandsShaderInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGeneratedCommandsShaderInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsShaderInfoEXT malloc() {
        return new VkGeneratedCommandsShaderInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGeneratedCommandsShaderInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsShaderInfoEXT calloc() {
        return new VkGeneratedCommandsShaderInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGeneratedCommandsShaderInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkGeneratedCommandsShaderInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeneratedCommandsShaderInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkGeneratedCommandsShaderInfoEXT} instance for the specified memory address. */
    public static VkGeneratedCommandsShaderInfoEXT create(long address) {
        return new VkGeneratedCommandsShaderInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGeneratedCommandsShaderInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkGeneratedCommandsShaderInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsShaderInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsShaderInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsShaderInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsShaderInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsShaderInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsShaderInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGeneratedCommandsShaderInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsShaderInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGeneratedCommandsShaderInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsShaderInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsShaderInfoEXT malloc(MemoryStack stack) {
        return new VkGeneratedCommandsShaderInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsShaderInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsShaderInfoEXT calloc(MemoryStack stack) {
        return new VkGeneratedCommandsShaderInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsShaderInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsShaderInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsShaderInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsShaderInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGeneratedCommandsShaderInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeneratedCommandsShaderInfoEXT.PNEXT); }
    /** Unsafe version of {@link #shaderCount}. */
    public static int nshaderCount(long struct) { return memGetInt(struct + VkGeneratedCommandsShaderInfoEXT.SHADERCOUNT); }
    /** Unsafe version of {@link #pShaders() pShaders}. */
    public static LongBuffer npShaders(long struct) { return memLongBuffer(memGetAddress(struct + VkGeneratedCommandsShaderInfoEXT.PSHADERS), nshaderCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGeneratedCommandsShaderInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeneratedCommandsShaderInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code shaderCount} field of the specified {@code struct}. */
    public static void nshaderCount(long struct, int value) { memPutInt(struct + VkGeneratedCommandsShaderInfoEXT.SHADERCOUNT, value); }
    /** Unsafe version of {@link #pShaders(LongBuffer) pShaders}. */
    public static void npShaders(long struct, LongBuffer value) { memPutAddress(struct + VkGeneratedCommandsShaderInfoEXT.PSHADERS, memAddress(value)); nshaderCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkGeneratedCommandsShaderInfoEXT.PSHADERS));
    }

    // -----------------------------------

    /** An array of {@link VkGeneratedCommandsShaderInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkGeneratedCommandsShaderInfoEXT, Buffer> implements NativeResource {

        private static final VkGeneratedCommandsShaderInfoEXT ELEMENT_FACTORY = VkGeneratedCommandsShaderInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkGeneratedCommandsShaderInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeneratedCommandsShaderInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGeneratedCommandsShaderInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeneratedCommandsShaderInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkGeneratedCommandsShaderInfoEXT.npNext(address()); }
        /** @return the value of the {@code shaderCount} field. */
        @NativeType("uint32_t")
        public int shaderCount() { return VkGeneratedCommandsShaderInfoEXT.nshaderCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pShaders} field. */
        @NativeType("VkShaderEXT const *")
        public LongBuffer pShaders() { return VkGeneratedCommandsShaderInfoEXT.npShaders(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGeneratedCommandsShaderInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkGeneratedCommandsShaderInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT} value to the {@code sType} field. */
        public VkGeneratedCommandsShaderInfoEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGeneratedCommandsShaderInfoEXT.Buffer pNext(@NativeType("void *") long value) { VkGeneratedCommandsShaderInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pShaders} field. */
        public VkGeneratedCommandsShaderInfoEXT.Buffer pShaders(@NativeType("VkShaderEXT const *") LongBuffer value) { VkGeneratedCommandsShaderInfoEXT.npShaders(address(), value); return this; }

    }

}