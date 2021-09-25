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
 * Structure specifying parameters of resolve image command.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
 * <li>If {@code srcImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code srcImage} <b>must</b> have a sample count equal to any valid sample count value other than {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If {@code dstImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code dstImage} <b>must</b> have a sample count equal to {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
 * <li>{@code srcImageLayout} <b>must</b> be {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR}, {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
 * <li>{@code dstImageLayout} <b>must</b> be {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR}, {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
 * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code dstImage} <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}</li>
 * <li>{@code srcImage} and {@code dstImage} <b>must</b> have been created with the same image format</li>
 * <li>The {@code srcSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code srcImage} was created</li>
 * <li>The {@code dstSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code dstImage} was created</li>
 * <li>The <code>srcSubresource.baseArrayLayer + srcSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code srcImage} was created</li>
 * <li>The <code>dstSubresource.baseArrayLayer + dstSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code dstImage} was created</li>
 * <li>{@code dstImage} and {@code srcImage} <b>must</b> not have been created with {@code flags} containing {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}</li>
 * <li>If either {@code srcImage} or {@code dstImage} are of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, then for each element of {@code pRegions}, {@code srcSubresource.baseArrayLayer} <b>must</b> be 0 and {@code srcSubresource.layerCount} <b>must</b> be 1</li>
 * <li>If either {@code srcImage} or {@code dstImage} are of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, then for each element of {@code pRegions}, {@code dstSubresource.baseArrayLayer} <b>must</b> be 0 and {@code dstSubresource.layerCount} <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code srcOffset.x} and <code>(extent.width + srcOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>For each element of {@code pRegions}, {@code srcOffset.y} and <code>(extent.height + srcOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code srcOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code srcOffset.z} and <code>(extent.depth + srcOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} or {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then for each element of {@code pRegions}, {@code srcOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.x} and <code>(extent.width + dstOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.y} and <code>(extent.height + dstOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code dstOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.z} and <code>(extent.depth + dstOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} or {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then for each element of {@code pRegions}, {@code dstOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid {@link VkImageResolve2KHR} structures</li>
 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
 * <li>Both of {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageResolve2KHR}, {@link KHRCopyCommands2#vkCmdResolveImage2KHR CmdResolveImage2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkResolveImageInfo2KHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImage {@link #srcImage};
 *     VkImageLayout {@link #srcImageLayout};
 *     VkImage {@link #dstImage};
 *     VkImageLayout {@link #dstImageLayout};
 *     uint32_t {@link #regionCount};
 *     {@link VkImageResolve2KHR VkImageResolve2KHR} const * {@link #pRegions};
 * }</code></pre>
 */
public class VkResolveImageInfo2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCIMAGE,
        SRCIMAGELAYOUT,
        DSTIMAGE,
        DSTIMAGELAYOUT,
        REGIONCOUNT,
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCIMAGE = layout.offsetof(2);
        SRCIMAGELAYOUT = layout.offsetof(3);
        DSTIMAGE = layout.offsetof(4);
        DSTIMAGELAYOUT = layout.offsetof(5);
        REGIONCOUNT = layout.offsetof(6);
        PREGIONS = layout.offsetof(7);
    }

    /**
     * Creates a {@code VkResolveImageInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkResolveImageInfo2KHR(ByteBuffer container) {
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
    /** the source image. */
    @NativeType("VkImage")
    public long srcImage() { return nsrcImage(address()); }
    /** the layout of the source image subresources for the resolve. */
    @NativeType("VkImageLayout")
    public int srcImageLayout() { return nsrcImageLayout(address()); }
    /** the destination image. */
    @NativeType("VkImage")
    public long dstImage() { return ndstImage(address()); }
    /** the layout of the destination image subresources for the resolve. */
    @NativeType("VkImageLayout")
    public int dstImageLayout() { return ndstImageLayout(address()); }
    /** the number of regions to resolve. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** a pointer to an array of {@link VkImageResolve2KHR} structures specifying the regions to resolve. */
    @NativeType("VkImageResolve2KHR const *")
    public VkImageResolve2KHR.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkResolveImageInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR} value to the {@link #sType} field. */
    public VkResolveImageInfo2KHR sType$Default() { return sType(KHRCopyCommands2.VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkResolveImageInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcImage} field. */
    public VkResolveImageInfo2KHR srcImage(@NativeType("VkImage") long value) { nsrcImage(address(), value); return this; }
    /** Sets the specified value to the {@link #srcImageLayout} field. */
    public VkResolveImageInfo2KHR srcImageLayout(@NativeType("VkImageLayout") int value) { nsrcImageLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #dstImage} field. */
    public VkResolveImageInfo2KHR dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@link #dstImageLayout} field. */
    public VkResolveImageInfo2KHR dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageResolve2KHR.Buffer} to the {@link #pRegions} field. */
    public VkResolveImageInfo2KHR pRegions(@NativeType("VkImageResolve2KHR const *") VkImageResolve2KHR.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkResolveImageInfo2KHR set(
        int sType,
        long pNext,
        long srcImage,
        int srcImageLayout,
        long dstImage,
        int dstImageLayout,
        VkImageResolve2KHR.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkResolveImageInfo2KHR set(VkResolveImageInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkResolveImageInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkResolveImageInfo2KHR malloc() {
        return wrap(VkResolveImageInfo2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkResolveImageInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkResolveImageInfo2KHR calloc() {
        return wrap(VkResolveImageInfo2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkResolveImageInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkResolveImageInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkResolveImageInfo2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkResolveImageInfo2KHR} instance for the specified memory address. */
    public static VkResolveImageInfo2KHR create(long address) {
        return wrap(VkResolveImageInfo2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkResolveImageInfo2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkResolveImageInfo2KHR.class, address);
    }

    /**
     * Returns a new {@link VkResolveImageInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkResolveImageInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkResolveImageInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkResolveImageInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkResolveImageInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkResolveImageInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkResolveImageInfo2KHR malloc(MemoryStack stack) {
        return wrap(VkResolveImageInfo2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkResolveImageInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkResolveImageInfo2KHR calloc(MemoryStack stack) {
        return wrap(VkResolveImageInfo2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkResolveImageInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkResolveImageInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkResolveImageInfo2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkResolveImageInfo2KHR.PNEXT); }
    /** Unsafe version of {@link #srcImage}. */
    public static long nsrcImage(long struct) { return UNSAFE.getLong(null, struct + VkResolveImageInfo2KHR.SRCIMAGE); }
    /** Unsafe version of {@link #srcImageLayout}. */
    public static int nsrcImageLayout(long struct) { return UNSAFE.getInt(null, struct + VkResolveImageInfo2KHR.SRCIMAGELAYOUT); }
    /** Unsafe version of {@link #dstImage}. */
    public static long ndstImage(long struct) { return UNSAFE.getLong(null, struct + VkResolveImageInfo2KHR.DSTIMAGE); }
    /** Unsafe version of {@link #dstImageLayout}. */
    public static int ndstImageLayout(long struct) { return UNSAFE.getInt(null, struct + VkResolveImageInfo2KHR.DSTIMAGELAYOUT); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return UNSAFE.getInt(null, struct + VkResolveImageInfo2KHR.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkImageResolve2KHR.Buffer npRegions(long struct) { return VkImageResolve2KHR.create(memGetAddress(struct + VkResolveImageInfo2KHR.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkResolveImageInfo2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkResolveImageInfo2KHR.PNEXT, value); }
    /** Unsafe version of {@link #srcImage(long) srcImage}. */
    public static void nsrcImage(long struct, long value) { UNSAFE.putLong(null, struct + VkResolveImageInfo2KHR.SRCIMAGE, value); }
    /** Unsafe version of {@link #srcImageLayout(int) srcImageLayout}. */
    public static void nsrcImageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkResolveImageInfo2KHR.SRCIMAGELAYOUT, value); }
    /** Unsafe version of {@link #dstImage(long) dstImage}. */
    public static void ndstImage(long struct, long value) { UNSAFE.putLong(null, struct + VkResolveImageInfo2KHR.DSTIMAGE, value); }
    /** Unsafe version of {@link #dstImageLayout(int) dstImageLayout}. */
    public static void ndstImageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkResolveImageInfo2KHR.DSTIMAGELAYOUT, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { UNSAFE.putInt(null, struct + VkResolveImageInfo2KHR.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkImageResolve2KHR.Buffer) pRegions}. */
    public static void npRegions(long struct, VkImageResolve2KHR.Buffer value) { memPutAddress(struct + VkResolveImageInfo2KHR.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkResolveImageInfo2KHR.PREGIONS));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkResolveImageInfo2KHR} structs. */
    public static class Buffer extends StructBuffer<VkResolveImageInfo2KHR, Buffer> implements NativeResource {

        private static final VkResolveImageInfo2KHR ELEMENT_FACTORY = VkResolveImageInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkResolveImageInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkResolveImageInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkResolveImageInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkResolveImageInfo2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkResolveImageInfo2KHR.nsType(address()); }
        /** @return the value of the {@link VkResolveImageInfo2KHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkResolveImageInfo2KHR.npNext(address()); }
        /** @return the value of the {@link VkResolveImageInfo2KHR#srcImage} field. */
        @NativeType("VkImage")
        public long srcImage() { return VkResolveImageInfo2KHR.nsrcImage(address()); }
        /** @return the value of the {@link VkResolveImageInfo2KHR#srcImageLayout} field. */
        @NativeType("VkImageLayout")
        public int srcImageLayout() { return VkResolveImageInfo2KHR.nsrcImageLayout(address()); }
        /** @return the value of the {@link VkResolveImageInfo2KHR#dstImage} field. */
        @NativeType("VkImage")
        public long dstImage() { return VkResolveImageInfo2KHR.ndstImage(address()); }
        /** @return the value of the {@link VkResolveImageInfo2KHR#dstImageLayout} field. */
        @NativeType("VkImageLayout")
        public int dstImageLayout() { return VkResolveImageInfo2KHR.ndstImageLayout(address()); }
        /** @return the value of the {@link VkResolveImageInfo2KHR#regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkResolveImageInfo2KHR.nregionCount(address()); }
        /** @return a {@link VkImageResolve2KHR.Buffer} view of the struct array pointed to by the {@link VkResolveImageInfo2KHR#pRegions} field. */
        @NativeType("VkImageResolve2KHR const *")
        public VkImageResolve2KHR.Buffer pRegions() { return VkResolveImageInfo2KHR.npRegions(address()); }

        /** Sets the specified value to the {@link VkResolveImageInfo2KHR#sType} field. */
        public VkResolveImageInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkResolveImageInfo2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR} value to the {@link VkResolveImageInfo2KHR#sType} field. */
        public VkResolveImageInfo2KHR.Buffer sType$Default() { return sType(KHRCopyCommands2.VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR); }
        /** Sets the specified value to the {@link VkResolveImageInfo2KHR#pNext} field. */
        public VkResolveImageInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkResolveImageInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkResolveImageInfo2KHR#srcImage} field. */
        public VkResolveImageInfo2KHR.Buffer srcImage(@NativeType("VkImage") long value) { VkResolveImageInfo2KHR.nsrcImage(address(), value); return this; }
        /** Sets the specified value to the {@link VkResolveImageInfo2KHR#srcImageLayout} field. */
        public VkResolveImageInfo2KHR.Buffer srcImageLayout(@NativeType("VkImageLayout") int value) { VkResolveImageInfo2KHR.nsrcImageLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkResolveImageInfo2KHR#dstImage} field. */
        public VkResolveImageInfo2KHR.Buffer dstImage(@NativeType("VkImage") long value) { VkResolveImageInfo2KHR.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@link VkResolveImageInfo2KHR#dstImageLayout} field. */
        public VkResolveImageInfo2KHR.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkResolveImageInfo2KHR.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageResolve2KHR.Buffer} to the {@link VkResolveImageInfo2KHR#pRegions} field. */
        public VkResolveImageInfo2KHR.Buffer pRegions(@NativeType("VkImageResolve2KHR const *") VkImageResolve2KHR.Buffer value) { VkResolveImageInfo2KHR.npRegions(address(), value); return this; }

    }

}