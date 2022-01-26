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
 * Structure specifying attachment information.
 * 
 * <h5>Description</h5>
 * 
 * <p>Values in {@code imageView} are loaded and stored according to the values of {@code loadOp} and {@code storeOp}, within the render area for each device specified in {@link VkRenderingInfo}. If {@code imageView} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, other members of this structure are ignored; writes to this attachment will be discarded, and no load, store, or resolve operations will be performed.</p>
 * 
 * <p>If {@code resolveMode} is {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, then {@code resolveImageView} is ignored. If {@code resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, values in {@code resolveImageView} within the render area become undefined once rendering begins. At the end of rendering, the color values written to each pixel location in {@code imageView} will be resolved according to {@code resolveMode} and stored into the the same location in {@code resolveImageView}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The resolve mode and store operation are independent; it is valid to write both resolved and unresolved values, and equally valid to discard the unresolved values while writing the resolved ones.</p>
 * </div>
 * 
 * <p>Store and resolve operations are only performed at the end of a render pass instance that does not specify the {@link KHRDynamicRendering#VK_RENDERING_SUSPENDING_BIT_KHR RENDERING_SUSPENDING_BIT_KHR} flag.</p>
 * 
 * <p>Load operations are only performed at the beginning of a render pass instance that does not specify the {@link KHRDynamicRendering#VK_RENDERING_RESUMING_BIT_KHR RENDERING_RESUMING_BIT_KHR} flag.</p>
 * 
 * <p>Image contents at the end of a suspended render pass instance remain defined for access by a resuming render pass instance.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and has a non-integer color format, {@code resolveMode} <b>must</b> be {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE} or {@link VK12#VK_RESOLVE_MODE_AVERAGE_BIT RESOLVE_MODE_AVERAGE_BIT}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and has an integer color format, {@code resolveMode} <b>must</b> be {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE} or {@link VK12#VK_RESOLVE_MODE_SAMPLE_ZERO_BIT RESOLVE_MODE_SAMPLE_ZERO_BIT}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@code resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, {@code imageView} <b>must</b> not have a sample count of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@code resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, {@code resolveImageView} <b>must</b> have a sample count of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@code resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, {@code imageView} and {@code resolveImageView} <b>must</b> have the same {@code VkFormat}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code layout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}, or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@code resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, {@code resolveImageLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}, or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@code resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, {@code resolveImageLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code layout} <b>must</b> not be {@link NVShadingRateImage#VK_IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@code resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, {@code resolveImageLayout} <b>must</b> not be {@link NVShadingRateImage#VK_IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code layout} <b>must</b> not be {@link EXTFragmentDensityMap#VK_IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@code resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, {@code resolveImageLayout} <b>must</b> not be {@link EXTFragmentDensityMap#VK_IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@code resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, {@code resolveImageLayout} <b>must</b> not be {@link KHRSynchronization2#VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code layout} <b>must</b> not be {@link KHRFragmentShadingRate#VK_IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@code resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, {@code resolveImageLayout} <b>must</b> not be {@link KHRFragmentShadingRate#VK_IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code layout} <b>must</b> not be {@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@code resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, {@code resolveImageLayout} <b>must</b> not be {@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
 * <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>If {@code resolveMode} is not 0, {@code resolveMode} <b>must</b> be a valid {@code VkResolveModeFlagBits} value</li>
 * <li>If {@code resolveImageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code resolveImageView} <b>must</b> be a valid {@code VkImageView} handle</li>
 * <li>{@code resolveImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code loadOp} <b>must</b> be a valid {@code VkAttachmentLoadOp} value</li>
 * <li>{@code storeOp} <b>must</b> be a valid {@code VkAttachmentStoreOp} value</li>
 * <li>{@code clearValue} <b>must</b> be a valid {@link VkClearValue} union</li>
 * <li>Both of {@code imageView}, and {@code resolveImageView} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkClearValue}, {@link VkRenderingInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderingAttachmentInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImageView {@link #imageView};
 *     VkImageLayout {@link #imageLayout};
 *     VkResolveModeFlagBits {@link #resolveMode};
 *     VkImageView {@link #resolveImageView};
 *     VkImageLayout {@link #resolveImageLayout};
 *     VkAttachmentLoadOp {@link #loadOp};
 *     VkAttachmentStoreOp {@link #storeOp};
 *     {@link VkClearValue VkClearValue} {@link #clearValue};
 * }</code></pre>
 */
public class VkRenderingAttachmentInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEVIEW,
        IMAGELAYOUT,
        RESOLVEMODE,
        RESOLVEIMAGEVIEW,
        RESOLVEIMAGELAYOUT,
        LOADOP,
        STOREOP,
        CLEARVALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(VkClearValue.SIZEOF, VkClearValue.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEVIEW = layout.offsetof(2);
        IMAGELAYOUT = layout.offsetof(3);
        RESOLVEMODE = layout.offsetof(4);
        RESOLVEIMAGEVIEW = layout.offsetof(5);
        RESOLVEIMAGELAYOUT = layout.offsetof(6);
        LOADOP = layout.offsetof(7);
        STOREOP = layout.offsetof(8);
        CLEARVALUE = layout.offsetof(9);
    }

    /**
     * Creates a {@code VkRenderingAttachmentInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingAttachmentInfo(ByteBuffer container) {
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
    /** the image view that will be used for rendering. */
    @NativeType("VkImageView")
    public long imageView() { return nimageView(address()); }
    /** the layout that {@code imageView} will be in during rendering. */
    @NativeType("VkImageLayout")
    public int imageLayout() { return nimageLayout(address()); }
    /** a {@code VkResolveModeFlagBits} value defining how multisampled data written to {@code imageView} will be resolved. */
    @NativeType("VkResolveModeFlagBits")
    public int resolveMode() { return nresolveMode(address()); }
    /** an image view used to write resolved multisample data at the end of rendering. */
    @NativeType("VkImageView")
    public long resolveImageView() { return nresolveImageView(address()); }
    /** the layout that {@code resolveImageView} will be in during rendering. */
    @NativeType("VkImageLayout")
    public int resolveImageLayout() { return nresolveImageLayout(address()); }
    /** a {@code VkAttachmentLoadOp} value specifying how the contents of {@code imageView} are treated at the start of the render pass instance. */
    @NativeType("VkAttachmentLoadOp")
    public int loadOp() { return nloadOp(address()); }
    /** a {@code VkAttachmentStoreOp} value specifying how the contents of {@code imageView} are treated at the end of the render pass instance. */
    @NativeType("VkAttachmentStoreOp")
    public int storeOp() { return nstoreOp(address()); }
    /** a {@link VkClearValue} structure defining values used to clear {@code imageView} when {@code loadOp} is {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}. */
    public VkClearValue clearValue() { return nclearValue(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderingAttachmentInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO} value to the {@link #sType} field. */
    public VkRenderingAttachmentInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderingAttachmentInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #imageView} field. */
    public VkRenderingAttachmentInfo imageView(@NativeType("VkImageView") long value) { nimageView(address(), value); return this; }
    /** Sets the specified value to the {@link #imageLayout} field. */
    public VkRenderingAttachmentInfo imageLayout(@NativeType("VkImageLayout") int value) { nimageLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #resolveMode} field. */
    public VkRenderingAttachmentInfo resolveMode(@NativeType("VkResolveModeFlagBits") int value) { nresolveMode(address(), value); return this; }
    /** Sets the specified value to the {@link #resolveImageView} field. */
    public VkRenderingAttachmentInfo resolveImageView(@NativeType("VkImageView") long value) { nresolveImageView(address(), value); return this; }
    /** Sets the specified value to the {@link #resolveImageLayout} field. */
    public VkRenderingAttachmentInfo resolveImageLayout(@NativeType("VkImageLayout") int value) { nresolveImageLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #loadOp} field. */
    public VkRenderingAttachmentInfo loadOp(@NativeType("VkAttachmentLoadOp") int value) { nloadOp(address(), value); return this; }
    /** Sets the specified value to the {@link #storeOp} field. */
    public VkRenderingAttachmentInfo storeOp(@NativeType("VkAttachmentStoreOp") int value) { nstoreOp(address(), value); return this; }
    /** Copies the specified {@link VkClearValue} to the {@link #clearValue} field. */
    public VkRenderingAttachmentInfo clearValue(VkClearValue value) { nclearValue(address(), value); return this; }
    /** Passes the {@link #clearValue} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRenderingAttachmentInfo clearValue(java.util.function.Consumer<VkClearValue> consumer) { consumer.accept(clearValue()); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderingAttachmentInfo set(
        int sType,
        long pNext,
        long imageView,
        int imageLayout,
        int resolveMode,
        long resolveImageView,
        int resolveImageLayout,
        int loadOp,
        int storeOp,
        VkClearValue clearValue
    ) {
        sType(sType);
        pNext(pNext);
        imageView(imageView);
        imageLayout(imageLayout);
        resolveMode(resolveMode);
        resolveImageView(resolveImageView);
        resolveImageLayout(resolveImageLayout);
        loadOp(loadOp);
        storeOp(storeOp);
        clearValue(clearValue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderingAttachmentInfo set(VkRenderingAttachmentInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingAttachmentInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingAttachmentInfo malloc() {
        return wrap(VkRenderingAttachmentInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderingAttachmentInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingAttachmentInfo calloc() {
        return wrap(VkRenderingAttachmentInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderingAttachmentInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderingAttachmentInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderingAttachmentInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingAttachmentInfo} instance for the specified memory address. */
    public static VkRenderingAttachmentInfo create(long address) {
        return wrap(VkRenderingAttachmentInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderingAttachmentInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderingAttachmentInfo.class, address);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderingAttachmentInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderingAttachmentInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingAttachmentInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingAttachmentInfo malloc(MemoryStack stack) {
        return wrap(VkRenderingAttachmentInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderingAttachmentInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingAttachmentInfo calloc(MemoryStack stack) {
        return wrap(VkRenderingAttachmentInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRenderingAttachmentInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderingAttachmentInfo.PNEXT); }
    /** Unsafe version of {@link #imageView}. */
    public static long nimageView(long struct) { return UNSAFE.getLong(null, struct + VkRenderingAttachmentInfo.IMAGEVIEW); }
    /** Unsafe version of {@link #imageLayout}. */
    public static int nimageLayout(long struct) { return UNSAFE.getInt(null, struct + VkRenderingAttachmentInfo.IMAGELAYOUT); }
    /** Unsafe version of {@link #resolveMode}. */
    public static int nresolveMode(long struct) { return UNSAFE.getInt(null, struct + VkRenderingAttachmentInfo.RESOLVEMODE); }
    /** Unsafe version of {@link #resolveImageView}. */
    public static long nresolveImageView(long struct) { return UNSAFE.getLong(null, struct + VkRenderingAttachmentInfo.RESOLVEIMAGEVIEW); }
    /** Unsafe version of {@link #resolveImageLayout}. */
    public static int nresolveImageLayout(long struct) { return UNSAFE.getInt(null, struct + VkRenderingAttachmentInfo.RESOLVEIMAGELAYOUT); }
    /** Unsafe version of {@link #loadOp}. */
    public static int nloadOp(long struct) { return UNSAFE.getInt(null, struct + VkRenderingAttachmentInfo.LOADOP); }
    /** Unsafe version of {@link #storeOp}. */
    public static int nstoreOp(long struct) { return UNSAFE.getInt(null, struct + VkRenderingAttachmentInfo.STOREOP); }
    /** Unsafe version of {@link #clearValue}. */
    public static VkClearValue nclearValue(long struct) { return VkClearValue.create(struct + VkRenderingAttachmentInfo.CLEARVALUE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingAttachmentInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderingAttachmentInfo.PNEXT, value); }
    /** Unsafe version of {@link #imageView(long) imageView}. */
    public static void nimageView(long struct, long value) { UNSAFE.putLong(null, struct + VkRenderingAttachmentInfo.IMAGEVIEW, value); }
    /** Unsafe version of {@link #imageLayout(int) imageLayout}. */
    public static void nimageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingAttachmentInfo.IMAGELAYOUT, value); }
    /** Unsafe version of {@link #resolveMode(int) resolveMode}. */
    public static void nresolveMode(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingAttachmentInfo.RESOLVEMODE, value); }
    /** Unsafe version of {@link #resolveImageView(long) resolveImageView}. */
    public static void nresolveImageView(long struct, long value) { UNSAFE.putLong(null, struct + VkRenderingAttachmentInfo.RESOLVEIMAGEVIEW, value); }
    /** Unsafe version of {@link #resolveImageLayout(int) resolveImageLayout}. */
    public static void nresolveImageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingAttachmentInfo.RESOLVEIMAGELAYOUT, value); }
    /** Unsafe version of {@link #loadOp(int) loadOp}. */
    public static void nloadOp(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingAttachmentInfo.LOADOP, value); }
    /** Unsafe version of {@link #storeOp(int) storeOp}. */
    public static void nstoreOp(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingAttachmentInfo.STOREOP, value); }
    /** Unsafe version of {@link #clearValue(VkClearValue) clearValue}. */
    public static void nclearValue(long struct, VkClearValue value) { memCopy(value.address(), struct + VkRenderingAttachmentInfo.CLEARVALUE, VkClearValue.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkRenderingAttachmentInfo} structs. */
    public static class Buffer extends StructBuffer<VkRenderingAttachmentInfo, Buffer> implements NativeResource {

        private static final VkRenderingAttachmentInfo ELEMENT_FACTORY = VkRenderingAttachmentInfo.create(-1L);

        /**
         * Creates a new {@code VkRenderingAttachmentInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingAttachmentInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderingAttachmentInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderingAttachmentInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderingAttachmentInfo.nsType(address()); }
        /** @return the value of the {@link VkRenderingAttachmentInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderingAttachmentInfo.npNext(address()); }
        /** @return the value of the {@link VkRenderingAttachmentInfo#imageView} field. */
        @NativeType("VkImageView")
        public long imageView() { return VkRenderingAttachmentInfo.nimageView(address()); }
        /** @return the value of the {@link VkRenderingAttachmentInfo#imageLayout} field. */
        @NativeType("VkImageLayout")
        public int imageLayout() { return VkRenderingAttachmentInfo.nimageLayout(address()); }
        /** @return the value of the {@link VkRenderingAttachmentInfo#resolveMode} field. */
        @NativeType("VkResolveModeFlagBits")
        public int resolveMode() { return VkRenderingAttachmentInfo.nresolveMode(address()); }
        /** @return the value of the {@link VkRenderingAttachmentInfo#resolveImageView} field. */
        @NativeType("VkImageView")
        public long resolveImageView() { return VkRenderingAttachmentInfo.nresolveImageView(address()); }
        /** @return the value of the {@link VkRenderingAttachmentInfo#resolveImageLayout} field. */
        @NativeType("VkImageLayout")
        public int resolveImageLayout() { return VkRenderingAttachmentInfo.nresolveImageLayout(address()); }
        /** @return the value of the {@link VkRenderingAttachmentInfo#loadOp} field. */
        @NativeType("VkAttachmentLoadOp")
        public int loadOp() { return VkRenderingAttachmentInfo.nloadOp(address()); }
        /** @return the value of the {@link VkRenderingAttachmentInfo#storeOp} field. */
        @NativeType("VkAttachmentStoreOp")
        public int storeOp() { return VkRenderingAttachmentInfo.nstoreOp(address()); }
        /** @return a {@link VkClearValue} view of the {@link VkRenderingAttachmentInfo#clearValue} field. */
        public VkClearValue clearValue() { return VkRenderingAttachmentInfo.nclearValue(address()); }

        /** Sets the specified value to the {@link VkRenderingAttachmentInfo#sType} field. */
        public VkRenderingAttachmentInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingAttachmentInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO} value to the {@link VkRenderingAttachmentInfo#sType} field. */
        public VkRenderingAttachmentInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO); }
        /** Sets the specified value to the {@link VkRenderingAttachmentInfo#pNext} field. */
        public VkRenderingAttachmentInfo.Buffer pNext(@NativeType("void const *") long value) { VkRenderingAttachmentInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingAttachmentInfo#imageView} field. */
        public VkRenderingAttachmentInfo.Buffer imageView(@NativeType("VkImageView") long value) { VkRenderingAttachmentInfo.nimageView(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingAttachmentInfo#imageLayout} field. */
        public VkRenderingAttachmentInfo.Buffer imageLayout(@NativeType("VkImageLayout") int value) { VkRenderingAttachmentInfo.nimageLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingAttachmentInfo#resolveMode} field. */
        public VkRenderingAttachmentInfo.Buffer resolveMode(@NativeType("VkResolveModeFlagBits") int value) { VkRenderingAttachmentInfo.nresolveMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingAttachmentInfo#resolveImageView} field. */
        public VkRenderingAttachmentInfo.Buffer resolveImageView(@NativeType("VkImageView") long value) { VkRenderingAttachmentInfo.nresolveImageView(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingAttachmentInfo#resolveImageLayout} field. */
        public VkRenderingAttachmentInfo.Buffer resolveImageLayout(@NativeType("VkImageLayout") int value) { VkRenderingAttachmentInfo.nresolveImageLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingAttachmentInfo#loadOp} field. */
        public VkRenderingAttachmentInfo.Buffer loadOp(@NativeType("VkAttachmentLoadOp") int value) { VkRenderingAttachmentInfo.nloadOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingAttachmentInfo#storeOp} field. */
        public VkRenderingAttachmentInfo.Buffer storeOp(@NativeType("VkAttachmentStoreOp") int value) { VkRenderingAttachmentInfo.nstoreOp(address(), value); return this; }
        /** Copies the specified {@link VkClearValue} to the {@link VkRenderingAttachmentInfo#clearValue} field. */
        public VkRenderingAttachmentInfo.Buffer clearValue(VkClearValue value) { VkRenderingAttachmentInfo.nclearValue(address(), value); return this; }
        /** Passes the {@link VkRenderingAttachmentInfo#clearValue} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRenderingAttachmentInfo.Buffer clearValue(java.util.function.Consumer<VkClearValue> consumer) { consumer.accept(clearValue()); return this; }

    }

}