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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkCopyCommandTransformInfoQCOM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSurfaceTransformFlagBitsKHR transform;
 * }}</pre>
 */
public class VkCopyCommandTransformInfoQCOM extends Struct<VkCopyCommandTransformInfoQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TRANSFORM;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TRANSFORM = layout.offsetof(2);
    }

    protected VkCopyCommandTransformInfoQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyCommandTransformInfoQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkCopyCommandTransformInfoQCOM(address, container);
    }

    /**
     * Creates a {@code VkCopyCommandTransformInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyCommandTransformInfoQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code transform} field. */
    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int transform() { return ntransform(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyCommandTransformInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMRotatedCopyCommands#VK_STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM} value to the {@code sType} field. */
    public VkCopyCommandTransformInfoQCOM sType$Default() { return sType(QCOMRotatedCopyCommands.VK_STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyCommandTransformInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code transform} field. */
    public VkCopyCommandTransformInfoQCOM transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) { ntransform(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyCommandTransformInfoQCOM set(
        int sType,
        long pNext,
        int transform
    ) {
        sType(sType);
        pNext(pNext);
        transform(transform);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyCommandTransformInfoQCOM set(VkCopyCommandTransformInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyCommandTransformInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyCommandTransformInfoQCOM malloc() {
        return new VkCopyCommandTransformInfoQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyCommandTransformInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyCommandTransformInfoQCOM calloc() {
        return new VkCopyCommandTransformInfoQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyCommandTransformInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkCopyCommandTransformInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyCommandTransformInfoQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyCommandTransformInfoQCOM} instance for the specified memory address. */
    public static VkCopyCommandTransformInfoQCOM create(long address) {
        return new VkCopyCommandTransformInfoQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyCommandTransformInfoQCOM createSafe(long address) {
        return address == NULL ? null : new VkCopyCommandTransformInfoQCOM(address, null);
    }

    /**
     * Returns a new {@link VkCopyCommandTransformInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyCommandTransformInfoQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyCommandTransformInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyCommandTransformInfoQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyCommandTransformInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyCommandTransformInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyCommandTransformInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyCommandTransformInfoQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyCommandTransformInfoQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyCommandTransformInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyCommandTransformInfoQCOM malloc(MemoryStack stack) {
        return new VkCopyCommandTransformInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyCommandTransformInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyCommandTransformInfoQCOM calloc(MemoryStack stack) {
        return new VkCopyCommandTransformInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyCommandTransformInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyCommandTransformInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyCommandTransformInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyCommandTransformInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyCommandTransformInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyCommandTransformInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #transform}. */
    public static int ntransform(long struct) { return memGetInt(struct + VkCopyCommandTransformInfoQCOM.TRANSFORM); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyCommandTransformInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyCommandTransformInfoQCOM.PNEXT, value); }
    /** Unsafe version of {@link #transform(int) transform}. */
    public static void ntransform(long struct, int value) { memPutInt(struct + VkCopyCommandTransformInfoQCOM.TRANSFORM, value); }

    // -----------------------------------

    /** An array of {@link VkCopyCommandTransformInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkCopyCommandTransformInfoQCOM, Buffer> implements NativeResource {

        private static final VkCopyCommandTransformInfoQCOM ELEMENT_FACTORY = VkCopyCommandTransformInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkCopyCommandTransformInfoQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyCommandTransformInfoQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyCommandTransformInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyCommandTransformInfoQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyCommandTransformInfoQCOM.npNext(address()); }
        /** @return the value of the {@code transform} field. */
        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int transform() { return VkCopyCommandTransformInfoQCOM.ntransform(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyCommandTransformInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyCommandTransformInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMRotatedCopyCommands#VK_STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM} value to the {@code sType} field. */
        public VkCopyCommandTransformInfoQCOM.Buffer sType$Default() { return sType(QCOMRotatedCopyCommands.VK_STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyCommandTransformInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkCopyCommandTransformInfoQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code transform} field. */
        public VkCopyCommandTransformInfoQCOM.Buffer transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) { VkCopyCommandTransformInfoQCOM.ntransform(address(), value); return this; }

    }

}