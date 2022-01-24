/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing transform parameters of rotated copy command.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code transform} <b>must</b> be {@link KHRSurface#VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR SURFACE_TRANSFORM_IDENTITY_BIT_KHR}, {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR SURFACE_TRANSFORM_ROTATE_90_BIT_KHR}, {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR SURFACE_TRANSFORM_ROTATE_180_BIT_KHR}, or {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR SURFACE_TRANSFORM_ROTATE_270_BIT_KHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMRotatedCopyCommands#VK_STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyCommandTransformInfoQCOM {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSurfaceTransformFlagBitsKHR {@link #transform};
 * }</code></pre>
 */
public class VkCopyCommandTransformInfoQCOM extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkSurfaceTransformFlagBitsKHR} value describing the transform to be applied. */
    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int transform() { return ntransform(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCopyCommandTransformInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMRotatedCopyCommands#VK_STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM} value to the {@link #sType} field. */
    public VkCopyCommandTransformInfoQCOM sType$Default() { return sType(QCOMRotatedCopyCommands.VK_STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCopyCommandTransformInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #transform} field. */
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
        return wrap(VkCopyCommandTransformInfoQCOM.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCopyCommandTransformInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyCommandTransformInfoQCOM calloc() {
        return wrap(VkCopyCommandTransformInfoQCOM.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCopyCommandTransformInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkCopyCommandTransformInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCopyCommandTransformInfoQCOM.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCopyCommandTransformInfoQCOM} instance for the specified memory address. */
    public static VkCopyCommandTransformInfoQCOM create(long address) {
        return wrap(VkCopyCommandTransformInfoQCOM.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyCommandTransformInfoQCOM createSafe(long address) {
        return address == NULL ? null : wrap(VkCopyCommandTransformInfoQCOM.class, address);
    }

    /**
     * Returns a new {@link VkCopyCommandTransformInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyCommandTransformInfoQCOM.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyCommandTransformInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyCommandTransformInfoQCOM.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyCommandTransformInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyCommandTransformInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCopyCommandTransformInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyCommandTransformInfoQCOM.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyCommandTransformInfoQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkCopyCommandTransformInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyCommandTransformInfoQCOM malloc(MemoryStack stack) {
        return wrap(VkCopyCommandTransformInfoQCOM.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCopyCommandTransformInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyCommandTransformInfoQCOM calloc(MemoryStack stack) {
        return wrap(VkCopyCommandTransformInfoQCOM.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCopyCommandTransformInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyCommandTransformInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyCommandTransformInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyCommandTransformInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCopyCommandTransformInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyCommandTransformInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #transform}. */
    public static int ntransform(long struct) { return UNSAFE.getInt(null, struct + VkCopyCommandTransformInfoQCOM.TRANSFORM); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyCommandTransformInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyCommandTransformInfoQCOM.PNEXT, value); }
    /** Unsafe version of {@link #transform(int) transform}. */
    public static void ntransform(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyCommandTransformInfoQCOM.TRANSFORM, value); }

    // -----------------------------------

    /** An array of {@link VkCopyCommandTransformInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkCopyCommandTransformInfoQCOM, Buffer> implements NativeResource {

        private static final VkCopyCommandTransformInfoQCOM ELEMENT_FACTORY = VkCopyCommandTransformInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkCopyCommandTransformInfoQCOM.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyCommandTransformInfoQCOM#SIZEOF}, and its mark will be undefined.
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
        protected VkCopyCommandTransformInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyCommandTransformInfoQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyCommandTransformInfoQCOM.nsType(address()); }
        /** @return the value of the {@link VkCopyCommandTransformInfoQCOM#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyCommandTransformInfoQCOM.npNext(address()); }
        /** @return the value of the {@link VkCopyCommandTransformInfoQCOM#transform} field. */
        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int transform() { return VkCopyCommandTransformInfoQCOM.ntransform(address()); }

        /** Sets the specified value to the {@link VkCopyCommandTransformInfoQCOM#sType} field. */
        public VkCopyCommandTransformInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyCommandTransformInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMRotatedCopyCommands#VK_STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM} value to the {@link VkCopyCommandTransformInfoQCOM#sType} field. */
        public VkCopyCommandTransformInfoQCOM.Buffer sType$Default() { return sType(QCOMRotatedCopyCommands.VK_STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM); }
        /** Sets the specified value to the {@link VkCopyCommandTransformInfoQCOM#pNext} field. */
        public VkCopyCommandTransformInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkCopyCommandTransformInfoQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyCommandTransformInfoQCOM#transform} field. */
        public VkCopyCommandTransformInfoQCOM.Buffer transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) { VkCopyCommandTransformInfoQCOM.ntransform(address(), value); return this; }

    }

}