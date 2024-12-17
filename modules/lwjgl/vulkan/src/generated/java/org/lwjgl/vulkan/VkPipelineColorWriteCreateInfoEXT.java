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
 * struct VkPipelineColorWriteCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t attachmentCount;
 *     VkBool32 const * pColorWriteEnables;
 * }}</pre>
 */
public class VkPipelineColorWriteCreateInfoEXT extends Struct<VkPipelineColorWriteCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ATTACHMENTCOUNT,
        PCOLORWRITEENABLES;

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
        ATTACHMENTCOUNT = layout.offsetof(2);
        PCOLORWRITEENABLES = layout.offsetof(3);
    }

    protected VkPipelineColorWriteCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineColorWriteCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineColorWriteCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPipelineColorWriteCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineColorWriteCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code attachmentCount} field. */
    @NativeType("uint32_t")
    public int attachmentCount() { return nattachmentCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pColorWriteEnables} field. */
    @NativeType("VkBool32 const *")
    public @Nullable IntBuffer pColorWriteEnables() { return npColorWriteEnables(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineColorWriteCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTColorWriteEnable#VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkPipelineColorWriteCreateInfoEXT sType$Default() { return sType(EXTColorWriteEnable.VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineColorWriteCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pColorWriteEnables} field. */
    public VkPipelineColorWriteCreateInfoEXT pColorWriteEnables(@Nullable @NativeType("VkBool32 const *") IntBuffer value) { npColorWriteEnables(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineColorWriteCreateInfoEXT set(
        int sType,
        long pNext,
        @Nullable IntBuffer pColorWriteEnables
    ) {
        sType(sType);
        pNext(pNext);
        pColorWriteEnables(pColorWriteEnables);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineColorWriteCreateInfoEXT set(VkPipelineColorWriteCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineColorWriteCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineColorWriteCreateInfoEXT malloc() {
        return new VkPipelineColorWriteCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineColorWriteCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineColorWriteCreateInfoEXT calloc() {
        return new VkPipelineColorWriteCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineColorWriteCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineColorWriteCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineColorWriteCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineColorWriteCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineColorWriteCreateInfoEXT create(long address) {
        return new VkPipelineColorWriteCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineColorWriteCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPipelineColorWriteCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelineColorWriteCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorWriteCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorWriteCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorWriteCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorWriteCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorWriteCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineColorWriteCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorWriteCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineColorWriteCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineColorWriteCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorWriteCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineColorWriteCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineColorWriteCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorWriteCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineColorWriteCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineColorWriteCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorWriteCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorWriteCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorWriteCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineColorWriteCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineColorWriteCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #attachmentCount}. */
    public static int nattachmentCount(long struct) { return memGetInt(struct + VkPipelineColorWriteCreateInfoEXT.ATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorWriteEnables() pColorWriteEnables}. */
    public static @Nullable IntBuffer npColorWriteEnables(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPipelineColorWriteCreateInfoEXT.PCOLORWRITEENABLES), nattachmentCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineColorWriteCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineColorWriteCreateInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { memPutInt(struct + VkPipelineColorWriteCreateInfoEXT.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorWriteEnables(IntBuffer) pColorWriteEnables}. */
    public static void npColorWriteEnables(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkPipelineColorWriteCreateInfoEXT.PCOLORWRITEENABLES, memAddressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nattachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkPipelineColorWriteCreateInfoEXT.PCOLORWRITEENABLES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineColorWriteCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineColorWriteCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineColorWriteCreateInfoEXT ELEMENT_FACTORY = VkPipelineColorWriteCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineColorWriteCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineColorWriteCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineColorWriteCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineColorWriteCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineColorWriteCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code attachmentCount} field. */
        @NativeType("uint32_t")
        public int attachmentCount() { return VkPipelineColorWriteCreateInfoEXT.nattachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pColorWriteEnables} field. */
        @NativeType("VkBool32 const *")
        public @Nullable IntBuffer pColorWriteEnables() { return VkPipelineColorWriteCreateInfoEXT.npColorWriteEnables(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineColorWriteCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineColorWriteCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTColorWriteEnable#VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkPipelineColorWriteCreateInfoEXT.Buffer sType$Default() { return sType(EXTColorWriteEnable.VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineColorWriteCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineColorWriteCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pColorWriteEnables} field. */
        public VkPipelineColorWriteCreateInfoEXT.Buffer pColorWriteEnables(@Nullable @NativeType("VkBool32 const *") IntBuffer value) { VkPipelineColorWriteCreateInfoEXT.npColorWriteEnables(address(), value); return this; }

    }

}