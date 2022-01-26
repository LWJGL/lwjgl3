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
 * Structure specifying the multiview per-attribute properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>When dynamic render pass instances are being used, instead of specifying {@link NVXMultiviewPerViewAttributes#VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX} or {@link NVXMultiviewPerViewAttributes#VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX} in the subpass description flags, the per-attibute properties of the render pass instance <b>must</b> be specified by the {@link VkMultiviewPerViewAttributesInfoNVX} structure Include the {@link VkMultiviewPerViewAttributesInfoNVX} structure in the {@code pNext} chain of {@link VkGraphicsPipelineCreateInfo} when creating a graphics pipeline for dynamic rendering, {@link VkRenderingInfo} when starting a dynamic render pass instance, and {@link VkCommandBufferInheritanceInfo} when specifying the dynamic render pass instance parameters for secondary command buffers.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code perViewAttributesPositionXOnly} is {@link VK10#VK_TRUE TRUE} then {@code perViewAttributes} <b>must</b> also be {@link VK10#VK_TRUE TRUE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMultiviewPerViewAttributesInfoNVX {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #perViewAttributes};
 *     VkBool32 {@link #perViewAttributesPositionXOnly};
 * }</code></pre>
 */
public class VkMultiviewPerViewAttributesInfoNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PERVIEWATTRIBUTES,
        PERVIEWATTRIBUTESPOSITIONXONLY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PERVIEWATTRIBUTES = layout.offsetof(2);
        PERVIEWATTRIBUTESPOSITIONXONLY = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkMultiviewPerViewAttributesInfoNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMultiviewPerViewAttributesInfoNVX(ByteBuffer container) {
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
    /** specifies that shaders compiled for this pipeline write the attributes for all views in a single invocation of each vertex processing stage. All pipelines executed within a render pass instance that includes this bit <b>must</b> write per-view attributes to the {@code *PerViewNV[]} shader outputs, in addition to the non-per-view (e.g. {@code Position}) outputs. */
    @NativeType("VkBool32")
    public boolean perViewAttributes() { return nperViewAttributes(address()) != 0; }
    /** specifies that shaders compiled for this pipeline use per-view positions which only differ in value in the x component. Per-view viewport mask <b>can</b> also be used. */
    @NativeType("VkBool32")
    public boolean perViewAttributesPositionXOnly() { return nperViewAttributesPositionXOnly(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMultiviewPerViewAttributesInfoNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX} value to the {@link #sType} field. */
    public VkMultiviewPerViewAttributesInfoNVX sType$Default() { return sType(KHRDynamicRendering.VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMultiviewPerViewAttributesInfoNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #perViewAttributes} field. */
    public VkMultiviewPerViewAttributesInfoNVX perViewAttributes(@NativeType("VkBool32") boolean value) { nperViewAttributes(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #perViewAttributesPositionXOnly} field. */
    public VkMultiviewPerViewAttributesInfoNVX perViewAttributesPositionXOnly(@NativeType("VkBool32") boolean value) { nperViewAttributesPositionXOnly(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkMultiviewPerViewAttributesInfoNVX set(
        int sType,
        long pNext,
        boolean perViewAttributes,
        boolean perViewAttributesPositionXOnly
    ) {
        sType(sType);
        pNext(pNext);
        perViewAttributes(perViewAttributes);
        perViewAttributesPositionXOnly(perViewAttributesPositionXOnly);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMultiviewPerViewAttributesInfoNVX set(VkMultiviewPerViewAttributesInfoNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMultiviewPerViewAttributesInfoNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMultiviewPerViewAttributesInfoNVX malloc() {
        return wrap(VkMultiviewPerViewAttributesInfoNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMultiviewPerViewAttributesInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMultiviewPerViewAttributesInfoNVX calloc() {
        return wrap(VkMultiviewPerViewAttributesInfoNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMultiviewPerViewAttributesInfoNVX} instance allocated with {@link BufferUtils}. */
    public static VkMultiviewPerViewAttributesInfoNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMultiviewPerViewAttributesInfoNVX.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMultiviewPerViewAttributesInfoNVX} instance for the specified memory address. */
    public static VkMultiviewPerViewAttributesInfoNVX create(long address) {
        return wrap(VkMultiviewPerViewAttributesInfoNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMultiviewPerViewAttributesInfoNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkMultiviewPerViewAttributesInfoNVX.class, address);
    }

    /**
     * Returns a new {@link VkMultiviewPerViewAttributesInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewAttributesInfoNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMultiviewPerViewAttributesInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewAttributesInfoNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMultiviewPerViewAttributesInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewAttributesInfoNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMultiviewPerViewAttributesInfoNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewAttributesInfoNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMultiviewPerViewAttributesInfoNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkMultiviewPerViewAttributesInfoNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMultiviewPerViewAttributesInfoNVX malloc(MemoryStack stack) {
        return wrap(VkMultiviewPerViewAttributesInfoNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMultiviewPerViewAttributesInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMultiviewPerViewAttributesInfoNVX calloc(MemoryStack stack) {
        return wrap(VkMultiviewPerViewAttributesInfoNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMultiviewPerViewAttributesInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewAttributesInfoNVX.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMultiviewPerViewAttributesInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewAttributesInfoNVX.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMultiviewPerViewAttributesInfoNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMultiviewPerViewAttributesInfoNVX.PNEXT); }
    /** Unsafe version of {@link #perViewAttributes}. */
    public static int nperViewAttributes(long struct) { return UNSAFE.getInt(null, struct + VkMultiviewPerViewAttributesInfoNVX.PERVIEWATTRIBUTES); }
    /** Unsafe version of {@link #perViewAttributesPositionXOnly}. */
    public static int nperViewAttributesPositionXOnly(long struct) { return UNSAFE.getInt(null, struct + VkMultiviewPerViewAttributesInfoNVX.PERVIEWATTRIBUTESPOSITIONXONLY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMultiviewPerViewAttributesInfoNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMultiviewPerViewAttributesInfoNVX.PNEXT, value); }
    /** Unsafe version of {@link #perViewAttributes(boolean) perViewAttributes}. */
    public static void nperViewAttributes(long struct, int value) { UNSAFE.putInt(null, struct + VkMultiviewPerViewAttributesInfoNVX.PERVIEWATTRIBUTES, value); }
    /** Unsafe version of {@link #perViewAttributesPositionXOnly(boolean) perViewAttributesPositionXOnly}. */
    public static void nperViewAttributesPositionXOnly(long struct, int value) { UNSAFE.putInt(null, struct + VkMultiviewPerViewAttributesInfoNVX.PERVIEWATTRIBUTESPOSITIONXONLY, value); }

    // -----------------------------------

    /** An array of {@link VkMultiviewPerViewAttributesInfoNVX} structs. */
    public static class Buffer extends StructBuffer<VkMultiviewPerViewAttributesInfoNVX, Buffer> implements NativeResource {

        private static final VkMultiviewPerViewAttributesInfoNVX ELEMENT_FACTORY = VkMultiviewPerViewAttributesInfoNVX.create(-1L);

        /**
         * Creates a new {@code VkMultiviewPerViewAttributesInfoNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMultiviewPerViewAttributesInfoNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkMultiviewPerViewAttributesInfoNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMultiviewPerViewAttributesInfoNVX#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMultiviewPerViewAttributesInfoNVX.nsType(address()); }
        /** @return the value of the {@link VkMultiviewPerViewAttributesInfoNVX#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMultiviewPerViewAttributesInfoNVX.npNext(address()); }
        /** @return the value of the {@link VkMultiviewPerViewAttributesInfoNVX#perViewAttributes} field. */
        @NativeType("VkBool32")
        public boolean perViewAttributes() { return VkMultiviewPerViewAttributesInfoNVX.nperViewAttributes(address()) != 0; }
        /** @return the value of the {@link VkMultiviewPerViewAttributesInfoNVX#perViewAttributesPositionXOnly} field. */
        @NativeType("VkBool32")
        public boolean perViewAttributesPositionXOnly() { return VkMultiviewPerViewAttributesInfoNVX.nperViewAttributesPositionXOnly(address()) != 0; }

        /** Sets the specified value to the {@link VkMultiviewPerViewAttributesInfoNVX#sType} field. */
        public VkMultiviewPerViewAttributesInfoNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkMultiviewPerViewAttributesInfoNVX.nsType(address(), value); return this; }
        /** Sets the {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX} value to the {@link VkMultiviewPerViewAttributesInfoNVX#sType} field. */
        public VkMultiviewPerViewAttributesInfoNVX.Buffer sType$Default() { return sType(KHRDynamicRendering.VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX); }
        /** Sets the specified value to the {@link VkMultiviewPerViewAttributesInfoNVX#pNext} field. */
        public VkMultiviewPerViewAttributesInfoNVX.Buffer pNext(@NativeType("void const *") long value) { VkMultiviewPerViewAttributesInfoNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMultiviewPerViewAttributesInfoNVX#perViewAttributes} field. */
        public VkMultiviewPerViewAttributesInfoNVX.Buffer perViewAttributes(@NativeType("VkBool32") boolean value) { VkMultiviewPerViewAttributesInfoNVX.nperViewAttributes(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkMultiviewPerViewAttributesInfoNVX#perViewAttributesPositionXOnly} field. */
        public VkMultiviewPerViewAttributesInfoNVX.Buffer perViewAttributesPositionXOnly(@NativeType("VkBool32") boolean value) { VkMultiviewPerViewAttributesInfoNVX.nperViewAttributesPositionXOnly(address(), value ? 1 : 0); return this; }

    }

}