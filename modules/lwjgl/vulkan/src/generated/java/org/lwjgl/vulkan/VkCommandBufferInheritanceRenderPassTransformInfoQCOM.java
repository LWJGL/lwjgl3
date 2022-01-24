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
 * Structure describing transformed render pass parameters command buffer.
 * 
 * <h5>Description</h5>
 * 
 * <p>When the secondary is recorded to execute within a render pass instance using {@link VK10#vkCmdExecuteCommands CmdExecuteCommands}, the render pass transform parameters of the secondary command buffer <b>must</b> be consistent with the render pass transform parameters specified for the render pass instance. In particular, the {@code transform} and {@code renderArea} for command buffer <b>must</b> be identical to the {@code transform} and {@code renderArea} of the render pass instance.</p>
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
 * <li>{@code sType} <b>must</b> be {@link QCOMRenderPassTransform#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRect2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCommandBufferInheritanceRenderPassTransformInfoQCOM {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkSurfaceTransformFlagBitsKHR {@link #transform};
 *     {@link VkRect2D VkRect2D} {@link #renderArea};
 * }</code></pre>
 */
public class VkCommandBufferInheritanceRenderPassTransformInfoQCOM extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TRANSFORM,
        RENDERAREA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TRANSFORM = layout.offsetof(2);
        RENDERAREA = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkCommandBufferInheritanceRenderPassTransformInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkSurfaceTransformFlagBitsKHR} value describing the transform to be applied to the render pass. */
    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int transform() { return ntransform(address()); }
    /** the render area that is affected by the command buffer. */
    public VkRect2D renderArea() { return nrenderArea(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMRenderPassTransform#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM} value to the {@link #sType} field. */
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM sType$Default() { return sType(QCOMRenderPassTransform.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #transform} field. */
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) { ntransform(address(), value); return this; }
    /** Copies the specified {@link VkRect2D} to the {@link #renderArea} field. */
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea(VkRect2D value) { nrenderArea(address(), value); return this; }
    /** Passes the {@link #renderArea} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(renderArea()); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM set(
        int sType,
        long pNext,
        int transform,
        VkRect2D renderArea
    ) {
        sType(sType);
        pNext(pNext);
        transform(transform);
        renderArea(renderArea);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM set(VkCommandBufferInheritanceRenderPassTransformInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferInheritanceRenderPassTransformInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM malloc() {
        return wrap(VkCommandBufferInheritanceRenderPassTransformInfoQCOM.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderPassTransformInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM calloc() {
        return wrap(VkCommandBufferInheritanceRenderPassTransformInfoQCOM.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderPassTransformInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCommandBufferInheritanceRenderPassTransformInfoQCOM.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderPassTransformInfoQCOM} instance for the specified memory address. */
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM create(long address) {
        return wrap(VkCommandBufferInheritanceRenderPassTransformInfoQCOM.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM createSafe(long address) {
        return address == NULL ? null : wrap(VkCommandBufferInheritanceRenderPassTransformInfoQCOM.class, address);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceRenderPassTransformInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM malloc(MemoryStack stack) {
        return wrap(VkCommandBufferInheritanceRenderPassTransformInfoQCOM.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceRenderPassTransformInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM calloc(MemoryStack stack) {
        return wrap(VkCommandBufferInheritanceRenderPassTransformInfoQCOM.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderPassTransformInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferInheritanceRenderPassTransformInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #transform}. */
    public static int ntransform(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceRenderPassTransformInfoQCOM.TRANSFORM); }
    /** Unsafe version of {@link #renderArea}. */
    public static VkRect2D nrenderArea(long struct) { return VkRect2D.create(struct + VkCommandBufferInheritanceRenderPassTransformInfoQCOM.RENDERAREA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderPassTransformInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferInheritanceRenderPassTransformInfoQCOM.PNEXT, value); }
    /** Unsafe version of {@link #transform(int) transform}. */
    public static void ntransform(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceRenderPassTransformInfoQCOM.TRANSFORM, value); }
    /** Unsafe version of {@link #renderArea(VkRect2D) renderArea}. */
    public static void nrenderArea(long struct, VkRect2D value) { memCopy(value.address(), struct + VkCommandBufferInheritanceRenderPassTransformInfoQCOM.RENDERAREA, VkRect2D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceRenderPassTransformInfoQCOM, Buffer> implements NativeResource {

        private static final VkCommandBufferInheritanceRenderPassTransformInfoQCOM ELEMENT_FACTORY = VkCommandBufferInheritanceRenderPassTransformInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM#SIZEOF}, and its mark will be undefined.
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
        protected VkCommandBufferInheritanceRenderPassTransformInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.nsType(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.npNext(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM#transform} field. */
        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int transform() { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.ntransform(address()); }
        /** @return a {@link VkRect2D} view of the {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM#renderArea} field. */
        public VkRect2D renderArea() { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.nrenderArea(address()); }

        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM#sType} field. */
        public VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMRenderPassTransform#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM} value to the {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM#sType} field. */
        public VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer sType$Default() { return sType(QCOMRenderPassTransform.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM); }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM#pNext} field. */
        public VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer pNext(@NativeType("void *") long value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM#transform} field. */
        public VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.ntransform(address(), value); return this; }
        /** Copies the specified {@link VkRect2D} to the {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM#renderArea} field. */
        public VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer renderArea(VkRect2D value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.nrenderArea(address(), value); return this; }
        /** Passes the {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM#renderArea} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer renderArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(renderArea()); return this; }

    }

}