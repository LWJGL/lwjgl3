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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying fragment density map offset subpass end information.
 * 
 * <h5>Description</h5>
 * 
 * <p>The array elements are given per {@code layer} as defined by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fragmentdensitymap-fetch-density-value">Fetch Density Value</a>, where <code>index = layer</code>. Each <code>(x,y)</code> offset is in framebuffer pixels and shifts the fetch of the fragment density map by that amount. Offsets can be positive or negative.</p>
 * 
 * <p>Offset values specified for any subpass that is not the last subpass in the render pass are ignored. If the {@link VkSubpassEndInfo}{@code ::pNext} chain for the last subpass of a renderpass does not include {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM}, or if {@code fragmentDensityOffsetCount} is zero, then the offset <code>(0,0)</code> is used for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fragmentdensitymap-fetch-density-value">Fetch Density Value</a>.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMapOffsets">{@code fragmentDensityMapOffsets}</a> feature is not enabled or fragment density map is not enabled in the render pass, {@code fragmentDensityOffsetCount} <b>must</b> equal 0.</li>
 * <li>If {@link VkSubpassDescription}{@code ::fragmentDensityMapAttachment} is not is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and was not created with {@link QCOMFragmentDensityMapOffset#VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM}, {@code fragmentDensityOffsetCount} <b>must</b> equal 0.</li>
 * <li>If {@link VkSubpassDescription}{@code ::pDepthStencilAttachment} is not is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and was not created with {@link QCOMFragmentDensityMapOffset#VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM}, {@code fragmentDensityOffsetCount} <b>must</b> equal 0.</li>
 * <li>If any element of {@link VkSubpassDescription}{@code ::pInputAttachments} is not is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and was not created with {@link QCOMFragmentDensityMapOffset#VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM}, {@code fragmentDensityOffsetCount} <b>must</b> equal 0.</li>
 * <li>If any element of {@link VkSubpassDescription}{@code ::pColorAttachments} is not is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and was not created with {@link QCOMFragmentDensityMapOffset#VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM}, {@code fragmentDensityOffsetCount} <b>must</b> equal 0.</li>
 * <li>If any element of {@link VkSubpassDescription}{@code ::pResolveAttachments} is not is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and was not created with {@link QCOMFragmentDensityMapOffset#VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM}, {@code fragmentDensityOffsetCount} <b>must</b> equal 0.</li>
 * <li>If any element of {@link VkSubpassDescription}{@code ::pPreserveAttachments} is not is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and was not created with {@link QCOMFragmentDensityMapOffset#VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM}, {@code fragmentDensityOffsetCount} <b>must</b> equal 0.</li>
 * <li>If {@code fragmentDensityOffsetCount} is not 0 and multiview is enabled for the render pass, {@code fragmentDensityOffsetCount} <b>must</b> equal the {@code layerCount} that was specified in creating the fragment density map attachment view.</li>
 * <li>If {@code fragmentDensityOffsetCount} is not 0 and multiview is not enabled for the render pass, {@code fragmentDensityOffsetCount} <b>must</b> equal 1.</li>
 * <li>The {@code x} component of each element of {@code pFragmentDensityOffsets} <b>must</b> be an integer multiple of {@code fragmentDensityOffsetGranularity.width}.</li>
 * <li>The {@code y} component of each element of {@code pFragmentDensityOffsets} <b>must</b> be an integer multiple of {@code fragmentDensityOffsetGranularity.height}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMFragmentDensityMapOffset#VK_STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM}</li>
 * <li>If {@code fragmentDensityOffsetCount} is not 0, {@code pFragmentDensityOffsets} <b>must</b> be a valid pointer to an array of {@code fragmentDensityOffsetCount} {@link VkOffset2D} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkOffset2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassFragmentDensityMapOffsetEndInfoQCOM {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #fragmentDensityOffsetCount};
 *     {@link VkOffset2D VkOffset2D} const * {@link #pFragmentDensityOffsets};
 * }</code></pre>
 */
public class VkSubpassFragmentDensityMapOffsetEndInfoQCOM extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTDENSITYOFFSETCOUNT,
        PFRAGMENTDENSITYOFFSETS;

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
        FRAGMENTDENSITYOFFSETCOUNT = layout.offsetof(2);
        PFRAGMENTDENSITYOFFSETS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM(ByteBuffer container) {
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
    /** the number of offsets being specified. */
    @NativeType("uint32_t")
    public int fragmentDensityOffsetCount() { return nfragmentDensityOffsetCount(address()); }
    /** a pointer to an array of {@link VkOffset2D} structs, each of which describes the offset per layer. */
    @Nullable
    @NativeType("VkOffset2D const *")
    public VkOffset2D.Buffer pFragmentDensityOffsets() { return npFragmentDensityOffsets(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMFragmentDensityMapOffset#VK_STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM} value to the {@link #sType} field. */
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM sType$Default() { return sType(QCOMFragmentDensityMapOffset.VK_STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkOffset2D.Buffer} to the {@link #pFragmentDensityOffsets} field. */
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM pFragmentDensityOffsets(@Nullable @NativeType("VkOffset2D const *") VkOffset2D.Buffer value) { npFragmentDensityOffsets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM set(
        int sType,
        long pNext,
        @Nullable VkOffset2D.Buffer pFragmentDensityOffsets
    ) {
        sType(sType);
        pNext(pNext);
        pFragmentDensityOffsets(pFragmentDensityOffsets);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM set(VkSubpassFragmentDensityMapOffsetEndInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM malloc() {
        return wrap(VkSubpassFragmentDensityMapOffsetEndInfoQCOM.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM calloc() {
        return wrap(VkSubpassFragmentDensityMapOffsetEndInfoQCOM.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubpassFragmentDensityMapOffsetEndInfoQCOM.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM} instance for the specified memory address. */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM create(long address) {
        return wrap(VkSubpassFragmentDensityMapOffsetEndInfoQCOM.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM createSafe(long address) {
        return address == NULL ? null : wrap(VkSubpassFragmentDensityMapOffsetEndInfoQCOM.class, address);
    }

    /**
     * Returns a new {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM malloc(MemoryStack stack) {
        return wrap(VkSubpassFragmentDensityMapOffsetEndInfoQCOM.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM calloc(MemoryStack stack) {
        return wrap(VkSubpassFragmentDensityMapOffsetEndInfoQCOM.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #fragmentDensityOffsetCount}. */
    public static int nfragmentDensityOffsetCount(long struct) { return UNSAFE.getInt(null, struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.FRAGMENTDENSITYOFFSETCOUNT); }
    /** Unsafe version of {@link #pFragmentDensityOffsets}. */
    @Nullable public static VkOffset2D.Buffer npFragmentDensityOffsets(long struct) { return VkOffset2D.createSafe(memGetAddress(struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.PFRAGMENTDENSITYOFFSETS), nfragmentDensityOffsetCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.PNEXT, value); }
    /** Sets the specified value to the {@code fragmentDensityOffsetCount} field of the specified {@code struct}. */
    public static void nfragmentDensityOffsetCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.FRAGMENTDENSITYOFFSETCOUNT, value); }
    /** Unsafe version of {@link #pFragmentDensityOffsets(VkOffset2D.Buffer) pFragmentDensityOffsets}. */
    public static void npFragmentDensityOffsets(long struct, @Nullable VkOffset2D.Buffer value) { memPutAddress(struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.PFRAGMENTDENSITYOFFSETS, memAddressSafe(value)); nfragmentDensityOffsetCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nfragmentDensityOffsetCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.PFRAGMENTDENSITYOFFSETS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkSubpassFragmentDensityMapOffsetEndInfoQCOM, Buffer> implements NativeResource {

        private static final VkSubpassFragmentDensityMapOffsetEndInfoQCOM ELEMENT_FACTORY = VkSubpassFragmentDensityMapOffsetEndInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassFragmentDensityMapOffsetEndInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.nsType(address()); }
        /** @return the value of the {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.npNext(address()); }
        /** @return the value of the {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM#fragmentDensityOffsetCount} field. */
        @NativeType("uint32_t")
        public int fragmentDensityOffsetCount() { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.nfragmentDensityOffsetCount(address()); }
        /** @return a {@link VkOffset2D.Buffer} view of the struct array pointed to by the {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM#pFragmentDensityOffsets} field. */
        @Nullable
        @NativeType("VkOffset2D const *")
        public VkOffset2D.Buffer pFragmentDensityOffsets() { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.npFragmentDensityOffsets(address()); }

        /** Sets the specified value to the {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM#sType} field. */
        public VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMFragmentDensityMapOffset#VK_STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM} value to the {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM#sType} field. */
        public VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer sType$Default() { return sType(QCOMFragmentDensityMapOffset.VK_STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM); }
        /** Sets the specified value to the {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM#pNext} field. */
        public VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkOffset2D.Buffer} to the {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM#pFragmentDensityOffsets} field. */
        public VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer pFragmentDensityOffsets(@Nullable @NativeType("VkOffset2D const *") VkOffset2D.Buffer value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.npFragmentDensityOffsets(address(), value); return this; }

    }

}