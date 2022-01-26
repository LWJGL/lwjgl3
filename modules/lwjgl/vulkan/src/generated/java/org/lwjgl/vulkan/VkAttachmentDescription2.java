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
 * Structure specifying an attachment description.
 * 
 * <h5>Description</h5>
 * 
 * <p>Parameters defined by this structure with the same name as those in {@link VkAttachmentDescription} have the identical effect to those parameters.</p>
 * 
 * <p>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-separateDepthStencilLayouts">{@code separateDepthStencilLayouts}</a> feature is enabled, and {@code format} is a depth/stencil format, {@code initialLayout} and {@code finalLayout} <b>can</b> be set to a layout that only specifies the layout of the depth aspect.</p>
 * 
 * <p>If the {@code pNext} chain includes a {@link VkAttachmentDescriptionStencilLayout} structure, then the {@code stencilInitialLayout} and {@code stencilFinalLayout} members specify the initial and final layouts of the stencil aspect of a depth/stencil format, and {@code initialLayout} and {@code finalLayout} only apply to the depth aspect. For depth-only formats, the {@link VkAttachmentDescriptionStencilLayout} structure is ignored. For stencil-only formats, the initial and final layouts of the stencil aspect are taken from the {@link VkAttachmentDescriptionStencilLayout} structure if present, or {@code initialLayout} and {@code finalLayout} if not present.</p>
 * 
 * <p>If {@code format} is a depth/stencil format, and either {@code initialLayout} or {@code finalLayout} does not specify a layout for the stencil aspect, then the application <b>must</b> specify the initial and final layouts of the stencil aspect by including a {@link VkAttachmentDescriptionStencilLayout} structure in the {@code pNext} chain.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code finalLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</li>
 * <li>If {@code format} is a color format, {@code initialLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format, {@code initialLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}</li>
 * <li>If {@code format} is a color format, {@code finalLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format, {@code finalLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-separateDepthStencilLayouts">{@code separateDepthStencilLayouts}</a> feature is not enabled, {@code initialLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-separateDepthStencilLayouts">{@code separateDepthStencilLayouts}</a> feature is not enabled, {@code finalLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a color format, {@code initialLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a color format, {@code finalLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format which includes both depth and stencil aspects, and {@code initialLayout} is {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, the {@code pNext} chain <b>must</b> include a {@link VkAttachmentDescriptionStencilLayout} structure</li>
 * <li>If {@code format} is a depth/stencil format which includes both depth and stencil aspects, and {@code finalLayout} is {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, the {@code pNext} chain <b>must</b> include a {@link VkAttachmentDescriptionStencilLayout} structure</li>
 * <li>If {@code format} is a depth/stencil format which includes only the depth aspect, {@code initialLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format which includes only the depth aspect, {@code finalLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format which includes only the stencil aspect, {@code initialLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code format} is a depth/stencil format which includes only the stencil aspect, {@code finalLayout} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2 STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkAttachmentDescriptionStencilLayout}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkAttachmentDescriptionFlagBits} values</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>{@code loadOp} <b>must</b> be a valid {@code VkAttachmentLoadOp} value</li>
 * <li>{@code storeOp} <b>must</b> be a valid {@code VkAttachmentStoreOp} value</li>
 * <li>{@code stencilLoadOp} <b>must</b> be a valid {@code VkAttachmentLoadOp} value</li>
 * <li>{@code stencilStoreOp} <b>must</b> be a valid {@code VkAttachmentStoreOp} value</li>
 * <li>{@code initialLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code finalLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassCreateInfo2}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAttachmentDescription2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkAttachmentDescriptionFlags {@link #flags};
 *     VkFormat {@link #format};
 *     VkSampleCountFlagBits {@link #samples};
 *     VkAttachmentLoadOp {@link #loadOp};
 *     VkAttachmentStoreOp {@link #storeOp};
 *     VkAttachmentLoadOp {@link #stencilLoadOp};
 *     VkAttachmentStoreOp {@link #stencilStoreOp};
 *     VkImageLayout {@link #initialLayout};
 *     VkImageLayout {@link #finalLayout};
 * }</code></pre>
 */
public class VkAttachmentDescription2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        FORMAT,
        SAMPLES,
        LOADOP,
        STOREOP,
        STENCILLOADOP,
        STENCILSTOREOP,
        INITIALLAYOUT,
        FINALLAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        FORMAT = layout.offsetof(3);
        SAMPLES = layout.offsetof(4);
        LOADOP = layout.offsetof(5);
        STOREOP = layout.offsetof(6);
        STENCILLOADOP = layout.offsetof(7);
        STENCILSTOREOP = layout.offsetof(8);
        INITIALLAYOUT = layout.offsetof(9);
        FINALLAYOUT = layout.offsetof(10);
    }

    /**
     * Creates a {@code VkAttachmentDescription2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentDescription2(ByteBuffer container) {
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
    /** a bitmask of {@code VkAttachmentDescriptionFlagBits} specifying additional properties of the attachment. */
    @NativeType("VkAttachmentDescriptionFlags")
    public int flags() { return nflags(address()); }
    /** a {@code VkFormat} value specifying the format of the image that will be used for the attachment. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** a {@code VkSampleCountFlagBits} value specifying the number of samples of the image. */
    @NativeType("VkSampleCountFlagBits")
    public int samples() { return nsamples(address()); }
    /** a {@code VkAttachmentLoadOp} value specifying how the contents of color and depth components of the attachment are treated at the beginning of the subpass where it is first used. */
    @NativeType("VkAttachmentLoadOp")
    public int loadOp() { return nloadOp(address()); }
    /** a {@code VkAttachmentStoreOp} value specifying how the contents of color and depth components of the attachment are treated at the end of the subpass where it is last used. */
    @NativeType("VkAttachmentStoreOp")
    public int storeOp() { return nstoreOp(address()); }
    /** a {@code VkAttachmentLoadOp} value specifying how the contents of stencil components of the attachment are treated at the beginning of the subpass where it is first used. */
    @NativeType("VkAttachmentLoadOp")
    public int stencilLoadOp() { return nstencilLoadOp(address()); }
    /** a {@code VkAttachmentStoreOp} value specifying how the contents of stencil components of the attachment are treated at the end of the last subpass where it is used. */
    @NativeType("VkAttachmentStoreOp")
    public int stencilStoreOp() { return nstencilStoreOp(address()); }
    /** the layout the attachment image subresource will be in when a render pass instance begins. */
    @NativeType("VkImageLayout")
    public int initialLayout() { return ninitialLayout(address()); }
    /** the layout the attachment image subresource will be transitioned to when a render pass instance ends. */
    @NativeType("VkImageLayout")
    public int finalLayout() { return nfinalLayout(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAttachmentDescription2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2 STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2} value to the {@link #sType} field. */
    public VkAttachmentDescription2 sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAttachmentDescription2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkAttachmentDescriptionStencilLayout} value to the {@code pNext} chain. */
    public VkAttachmentDescription2 pNext(VkAttachmentDescriptionStencilLayout value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkAttachmentDescriptionStencilLayoutKHR} value to the {@code pNext} chain. */
    public VkAttachmentDescription2 pNext(VkAttachmentDescriptionStencilLayoutKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkAttachmentDescription2 flags(@NativeType("VkAttachmentDescriptionFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #format} field. */
    public VkAttachmentDescription2 format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@link #samples} field. */
    public VkAttachmentDescription2 samples(@NativeType("VkSampleCountFlagBits") int value) { nsamples(address(), value); return this; }
    /** Sets the specified value to the {@link #loadOp} field. */
    public VkAttachmentDescription2 loadOp(@NativeType("VkAttachmentLoadOp") int value) { nloadOp(address(), value); return this; }
    /** Sets the specified value to the {@link #storeOp} field. */
    public VkAttachmentDescription2 storeOp(@NativeType("VkAttachmentStoreOp") int value) { nstoreOp(address(), value); return this; }
    /** Sets the specified value to the {@link #stencilLoadOp} field. */
    public VkAttachmentDescription2 stencilLoadOp(@NativeType("VkAttachmentLoadOp") int value) { nstencilLoadOp(address(), value); return this; }
    /** Sets the specified value to the {@link #stencilStoreOp} field. */
    public VkAttachmentDescription2 stencilStoreOp(@NativeType("VkAttachmentStoreOp") int value) { nstencilStoreOp(address(), value); return this; }
    /** Sets the specified value to the {@link #initialLayout} field. */
    public VkAttachmentDescription2 initialLayout(@NativeType("VkImageLayout") int value) { ninitialLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #finalLayout} field. */
    public VkAttachmentDescription2 finalLayout(@NativeType("VkImageLayout") int value) { nfinalLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAttachmentDescription2 set(
        int sType,
        long pNext,
        int flags,
        int format,
        int samples,
        int loadOp,
        int storeOp,
        int stencilLoadOp,
        int stencilStoreOp,
        int initialLayout,
        int finalLayout
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        format(format);
        samples(samples);
        loadOp(loadOp);
        storeOp(storeOp);
        stencilLoadOp(stencilLoadOp);
        stencilStoreOp(stencilStoreOp);
        initialLayout(initialLayout);
        finalLayout(finalLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAttachmentDescription2 set(VkAttachmentDescription2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentDescription2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentDescription2 malloc() {
        return wrap(VkAttachmentDescription2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAttachmentDescription2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentDescription2 calloc() {
        return wrap(VkAttachmentDescription2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAttachmentDescription2} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentDescription2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAttachmentDescription2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentDescription2} instance for the specified memory address. */
    public static VkAttachmentDescription2 create(long address) {
        return wrap(VkAttachmentDescription2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentDescription2 createSafe(long address) {
        return address == NULL ? null : wrap(VkAttachmentDescription2.class, address);
    }

    /**
     * Returns a new {@link VkAttachmentDescription2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescription2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescription2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAttachmentDescription2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentDescription2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkAttachmentDescription2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentDescription2 malloc(MemoryStack stack) {
        return wrap(VkAttachmentDescription2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAttachmentDescription2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentDescription2 calloc(MemoryStack stack) {
        return wrap(VkAttachmentDescription2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAttachmentDescription2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescription2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescription2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAttachmentDescription2.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescription2.FLAGS); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescription2.FORMAT); }
    /** Unsafe version of {@link #samples}. */
    public static int nsamples(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescription2.SAMPLES); }
    /** Unsafe version of {@link #loadOp}. */
    public static int nloadOp(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescription2.LOADOP); }
    /** Unsafe version of {@link #storeOp}. */
    public static int nstoreOp(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescription2.STOREOP); }
    /** Unsafe version of {@link #stencilLoadOp}. */
    public static int nstencilLoadOp(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescription2.STENCILLOADOP); }
    /** Unsafe version of {@link #stencilStoreOp}. */
    public static int nstencilStoreOp(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescription2.STENCILSTOREOP); }
    /** Unsafe version of {@link #initialLayout}. */
    public static int ninitialLayout(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescription2.INITIALLAYOUT); }
    /** Unsafe version of {@link #finalLayout}. */
    public static int nfinalLayout(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescription2.FINALLAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescription2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAttachmentDescription2.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescription2.FLAGS, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescription2.FORMAT, value); }
    /** Unsafe version of {@link #samples(int) samples}. */
    public static void nsamples(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescription2.SAMPLES, value); }
    /** Unsafe version of {@link #loadOp(int) loadOp}. */
    public static void nloadOp(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescription2.LOADOP, value); }
    /** Unsafe version of {@link #storeOp(int) storeOp}. */
    public static void nstoreOp(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescription2.STOREOP, value); }
    /** Unsafe version of {@link #stencilLoadOp(int) stencilLoadOp}. */
    public static void nstencilLoadOp(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescription2.STENCILLOADOP, value); }
    /** Unsafe version of {@link #stencilStoreOp(int) stencilStoreOp}. */
    public static void nstencilStoreOp(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescription2.STENCILSTOREOP, value); }
    /** Unsafe version of {@link #initialLayout(int) initialLayout}. */
    public static void ninitialLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescription2.INITIALLAYOUT, value); }
    /** Unsafe version of {@link #finalLayout(int) finalLayout}. */
    public static void nfinalLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescription2.FINALLAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkAttachmentDescription2} structs. */
    public static class Buffer extends StructBuffer<VkAttachmentDescription2, Buffer> implements NativeResource {

        private static final VkAttachmentDescription2 ELEMENT_FACTORY = VkAttachmentDescription2.create(-1L);

        /**
         * Creates a new {@code VkAttachmentDescription2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentDescription2#SIZEOF}, and its mark will be undefined.
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
        protected VkAttachmentDescription2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAttachmentDescription2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAttachmentDescription2.nsType(address()); }
        /** @return the value of the {@link VkAttachmentDescription2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAttachmentDescription2.npNext(address()); }
        /** @return the value of the {@link VkAttachmentDescription2#flags} field. */
        @NativeType("VkAttachmentDescriptionFlags")
        public int flags() { return VkAttachmentDescription2.nflags(address()); }
        /** @return the value of the {@link VkAttachmentDescription2#format} field. */
        @NativeType("VkFormat")
        public int format() { return VkAttachmentDescription2.nformat(address()); }
        /** @return the value of the {@link VkAttachmentDescription2#samples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int samples() { return VkAttachmentDescription2.nsamples(address()); }
        /** @return the value of the {@link VkAttachmentDescription2#loadOp} field. */
        @NativeType("VkAttachmentLoadOp")
        public int loadOp() { return VkAttachmentDescription2.nloadOp(address()); }
        /** @return the value of the {@link VkAttachmentDescription2#storeOp} field. */
        @NativeType("VkAttachmentStoreOp")
        public int storeOp() { return VkAttachmentDescription2.nstoreOp(address()); }
        /** @return the value of the {@link VkAttachmentDescription2#stencilLoadOp} field. */
        @NativeType("VkAttachmentLoadOp")
        public int stencilLoadOp() { return VkAttachmentDescription2.nstencilLoadOp(address()); }
        /** @return the value of the {@link VkAttachmentDescription2#stencilStoreOp} field. */
        @NativeType("VkAttachmentStoreOp")
        public int stencilStoreOp() { return VkAttachmentDescription2.nstencilStoreOp(address()); }
        /** @return the value of the {@link VkAttachmentDescription2#initialLayout} field. */
        @NativeType("VkImageLayout")
        public int initialLayout() { return VkAttachmentDescription2.ninitialLayout(address()); }
        /** @return the value of the {@link VkAttachmentDescription2#finalLayout} field. */
        @NativeType("VkImageLayout")
        public int finalLayout() { return VkAttachmentDescription2.nfinalLayout(address()); }

        /** Sets the specified value to the {@link VkAttachmentDescription2#sType} field. */
        public VkAttachmentDescription2.Buffer sType(@NativeType("VkStructureType") int value) { VkAttachmentDescription2.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2 STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2} value to the {@link VkAttachmentDescription2#sType} field. */
        public VkAttachmentDescription2.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2); }
        /** Sets the specified value to the {@link VkAttachmentDescription2#pNext} field. */
        public VkAttachmentDescription2.Buffer pNext(@NativeType("void const *") long value) { VkAttachmentDescription2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkAttachmentDescriptionStencilLayout} value to the {@code pNext} chain. */
        public VkAttachmentDescription2.Buffer pNext(VkAttachmentDescriptionStencilLayout value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkAttachmentDescriptionStencilLayoutKHR} value to the {@code pNext} chain. */
        public VkAttachmentDescription2.Buffer pNext(VkAttachmentDescriptionStencilLayoutKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkAttachmentDescription2#flags} field. */
        public VkAttachmentDescription2.Buffer flags(@NativeType("VkAttachmentDescriptionFlags") int value) { VkAttachmentDescription2.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription2#format} field. */
        public VkAttachmentDescription2.Buffer format(@NativeType("VkFormat") int value) { VkAttachmentDescription2.nformat(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription2#samples} field. */
        public VkAttachmentDescription2.Buffer samples(@NativeType("VkSampleCountFlagBits") int value) { VkAttachmentDescription2.nsamples(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription2#loadOp} field. */
        public VkAttachmentDescription2.Buffer loadOp(@NativeType("VkAttachmentLoadOp") int value) { VkAttachmentDescription2.nloadOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription2#storeOp} field. */
        public VkAttachmentDescription2.Buffer storeOp(@NativeType("VkAttachmentStoreOp") int value) { VkAttachmentDescription2.nstoreOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription2#stencilLoadOp} field. */
        public VkAttachmentDescription2.Buffer stencilLoadOp(@NativeType("VkAttachmentLoadOp") int value) { VkAttachmentDescription2.nstencilLoadOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription2#stencilStoreOp} field. */
        public VkAttachmentDescription2.Buffer stencilStoreOp(@NativeType("VkAttachmentStoreOp") int value) { VkAttachmentDescription2.nstencilStoreOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription2#initialLayout} field. */
        public VkAttachmentDescription2.Buffer initialLayout(@NativeType("VkImageLayout") int value) { VkAttachmentDescription2.ninitialLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescription2#finalLayout} field. */
        public VkAttachmentDescription2.Buffer finalLayout(@NativeType("VkImageLayout") int value) { VkAttachmentDescription2.nfinalLayout(address(), value); return this; }

    }

}