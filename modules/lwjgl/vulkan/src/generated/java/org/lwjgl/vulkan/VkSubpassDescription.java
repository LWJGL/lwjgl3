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
 * Structure specifying a subpass description.
 * 
 * <h5>Description</h5>
 * 
 * <p>The contents of an attachment within the render area become undefined at the start of a subpass <b>S</b> if all of the following conditions are true:</p>
 * 
 * <ul>
 * <li>The attachment is used as a color, depth/stencil, or resolve attachment in any subpass in the render pass.</li>
 * <li>There is a subpass <b>S<sub>1</sub></b> that uses or preserves the attachment, and a subpass dependency from <b>S<sub>1</sub></b> to <b>S</b>.</li>
 * <li>The attachment is not used or preserved in subpass <b>S</b>.</li>
 * </ul>
 * 
 * <p>Once the contents of an attachment become undefined in subpass <b>S</b>, they remain undefined for subpasses in subpass dependency chains starting with subpass <b>S</b> until they are written again. However, they remain valid for subpasses in other subpass dependency chains starting with subpass <b>S<sub>1</sub></b> if those subpasses use or preserve the attachment.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code pipelineBindPoint} <b>must</b> be {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
 * <li>{@code colorAttachmentCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxColorAttachments}</li>
 * <li>If the first use of an attachment in this render pass is as an input attachment, and the attachment is not also used as a color or depth/stencil attachment in the same subpass, then {@code loadOp} <b>must</b> not be {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}</li>
 * <li>If {@code pResolveAttachments} is not {@code NULL}, for each resolve attachment that does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the corresponding color attachment <b>must</b> not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If {@code pResolveAttachments} is not {@code NULL}, the sample count of each element of {@code pColorAttachments} <b>must</b> be anything other than {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>Each element of {@code pResolveAttachments} <b>must</b> have a sample count of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>Each element of {@code pResolveAttachments} <b>must</b> have the same {@code VkFormat} as its corresponding color attachment</li>
 * <li>All attachments in {@code pColorAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have the same sample count</li>
 * <li>All attachments in {@code pColorAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have a sample count that is smaller than or equal to the sample count of {@code pDepthStencilAttachment} if it is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If any input attachments are {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, then any pipelines bound during the subpass <b>must</b> not access those input attachments from the fragment shader</li>
 * <li>The {@code attachment} member of each element of {@code pPreserveAttachments} <b>must</b> not be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>Each element of {@code pPreserveAttachments} <b>must</b> not also be an element of any other member of the subpass description</li>
 * <li>If any attachment is used as both an input attachment and a color or depth/stencil attachment, then each use <b>must</b> use the same {@code layout}</li>
 * <li>If {@code flags} includes {@link NVXMultiviewPerViewAttributes#VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX}, it <b>must</b> also include {@link NVXMultiviewPerViewAttributes#VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSubpassDescriptionFlagBits} values</li>
 * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
 * <li>If {@code inputAttachmentCount} is not 0, {@code pInputAttachments} <b>must</b> be a valid pointer to an array of {@code inputAttachmentCount} valid {@link VkAttachmentReference} structures</li>
 * <li>If {@code colorAttachmentCount} is not 0, {@code pColorAttachments} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} valid {@link VkAttachmentReference} structures</li>
 * <li>If {@code colorAttachmentCount} is not 0, and {@code pResolveAttachments} is not {@code NULL}, {@code pResolveAttachments} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} valid {@link VkAttachmentReference} structures</li>
 * <li>If {@code pDepthStencilAttachment} is not {@code NULL}, {@code pDepthStencilAttachment} <b>must</b> be a valid pointer to a valid {@link VkAttachmentReference} structure</li>
 * <li>If {@code preserveAttachmentCount} is not 0, {@code pPreserveAttachments} <b>must</b> be a valid pointer to an array of {@code preserveAttachmentCount} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAttachmentReference}, {@link VkRenderPassCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code flags} &ndash; a bitmask of {@code VkSubpassDescriptionFlagBits} specifying usage of the subpass.</li>
 * <li>{@code pipelineBindPoint} &ndash; a {@code VkPipelineBindPoint} value specifying whether this is a compute or graphics subpass. Currently, only graphics subpasses are supported.</li>
 * <li>{@code inputAttachmentCount} &ndash; the number of input attachments.</li>
 * <li>{@code pInputAttachments} &ndash; an array of {@link VkAttachmentReference} structures (defined below) that lists which of the render pass&#8217;s attachments <b>can</b> be read in the fragment shader stage during the subpass, and what layout each attachment will be in during the subpass. Each element of the array corresponds to an input attachment unit number in the shader, i.e. if the shader declares an input variable {@code layout(input_attachment_index=X, set=Y, binding=Z)} then it uses the attachment provided in {@code pInputAttachments}[X]. Input attachments <b>must</b> also be bound to the pipeline with a descriptor set, with the input attachment descriptor written in the location (set=Y, binding=Z). Fragment shaders <b>can</b> use subpass input variables to access the contents of an input attachment at the fragment&#8217;s (x, y, layer) framebuffer coordinates.</li>
 * <li>{@code colorAttachmentCount} &ndash; the number of color attachments.</li>
 * <li>{@code pColorAttachments} &ndash; an array of {@code colorAttachmentCount} {@link VkAttachmentReference} structures that lists which of the render pass&#8217;s attachments will be used as color attachments in the subpass, and what layout each attachment will be in during the subpass. Each element of the array corresponds to a fragment shader output location, i.e. if the shader declared an output variable {@code layout(location=X)} then it uses the attachment provided in {@code pColorAttachments}[X].</li>
 * <li>{@code pResolveAttachments} &ndash; {@code NULL} or an array of {@code colorAttachmentCount} {@link VkAttachmentReference} structures that lists which of the render pass&#8217;s attachments are resolved to at the end of the subpass, and what layout each attachment will be in during the multisample resolve operation. If {@code pResolveAttachments} is not {@code NULL}, each of its elements corresponds to a color attachment (the element in {@code pColorAttachments} at the same index), and a multisample resolve operation is defined for each attachment. At the end of each subpass, multisample resolve operations read the subpass&#8217;s color attachments, and resolve the samples for each pixel to the same pixel location in the corresponding resolve attachments, unless the resolve attachment index is {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}. If the first use of an attachment in a render pass is as a resolve attachment, then the {@code loadOp} is effectively ignored as the resolve is guaranteed to overwrite all pixels in the render area.</li>
 * <li>{@code pDepthStencilAttachment} &ndash; a pointer to a {@link VkAttachmentReference} specifying which attachment will be used for depth/stencil data and the layout it will be in during the subpass. Setting the attachment index to {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} or leaving this pointer as {@code NULL} indicates that no depth/stencil attachment will be used in the subpass.</li>
 * <li>{@code preserveAttachmentCount} &ndash; the number of preserved attachments.</li>
 * <li>{@code pPreserveAttachments} &ndash; an array of {@code preserveAttachmentCount} render pass attachment indices describing the attachments that are not used by a subpass, but whose contents <b>must</b> be preserved throughout the subpass.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkSubpassDescription {
 *     VkSubpassDescriptionFlags flags;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     uint32_t inputAttachmentCount;
 *     {@link VkAttachmentReference VkAttachmentReference const} * pInputAttachments;
 *     uint32_t colorAttachmentCount;
 *     {@link VkAttachmentReference VkAttachmentReference const} * pColorAttachments;
 *     {@link VkAttachmentReference VkAttachmentReference const} * pResolveAttachments;
 *     {@link VkAttachmentReference VkAttachmentReference const} * pDepthStencilAttachment;
 *     uint32_t preserveAttachmentCount;
 *     uint32_t const * pPreserveAttachments;
 * }</pre></code>
 */
public class VkSubpassDescription extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        PIPELINEBINDPOINT,
        INPUTATTACHMENTCOUNT,
        PINPUTATTACHMENTS,
        COLORATTACHMENTCOUNT,
        PCOLORATTACHMENTS,
        PRESOLVEATTACHMENTS,
        PDEPTHSTENCILATTACHMENT,
        PRESERVEATTACHMENTCOUNT,
        PPRESERVEATTACHMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        PIPELINEBINDPOINT = layout.offsetof(1);
        INPUTATTACHMENTCOUNT = layout.offsetof(2);
        PINPUTATTACHMENTS = layout.offsetof(3);
        COLORATTACHMENTCOUNT = layout.offsetof(4);
        PCOLORATTACHMENTS = layout.offsetof(5);
        PRESOLVEATTACHMENTS = layout.offsetof(6);
        PDEPTHSTENCILATTACHMENT = layout.offsetof(7);
        PRESERVEATTACHMENTCOUNT = layout.offsetof(8);
        PPRESERVEATTACHMENTS = layout.offsetof(9);
    }

    VkSubpassDescription(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkSubpassDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDescription(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code flags} field. */
    @NativeType("VkSubpassDescriptionFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code pipelineBindPoint} field. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** Returns the value of the {@code inputAttachmentCount} field. */
    @NativeType("uint32_t")
    public int inputAttachmentCount() { return ninputAttachmentCount(address()); }
    /** Returns a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pInputAttachments} field. */
    @Nullable
    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference.Buffer pInputAttachments() { return npInputAttachments(address()); }
    /** Returns the value of the {@code colorAttachmentCount} field. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** Returns a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pColorAttachments} field. */
    @Nullable
    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference.Buffer pColorAttachments() { return npColorAttachments(address()); }
    /** Returns a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pResolveAttachments} field. */
    @Nullable
    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference.Buffer pResolveAttachments() { return npResolveAttachments(address()); }
    /** Returns a {@link VkAttachmentReference} view of the struct pointed to by the {@code pDepthStencilAttachment} field. */
    @Nullable
    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference pDepthStencilAttachment() { return npDepthStencilAttachment(address()); }
    /** Returns the value of the {@code preserveAttachmentCount} field. */
    @NativeType("uint32_t")
    public int preserveAttachmentCount() { return npreserveAttachmentCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pPreserveAttachments} field. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pPreserveAttachments() { return npPreserveAttachments(address()); }

    /** Sets the specified value to the {@code flags} field. */
    public VkSubpassDescription flags(@NativeType("VkSubpassDescriptionFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBindPoint} field. */
    public VkSubpassDescription pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pInputAttachments} field. */
    public VkSubpassDescription pInputAttachments(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) { npInputAttachments(address(), value); return this; }
    /** Sets the specified value to the {@code colorAttachmentCount} field. */
    public VkSubpassDescription colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pColorAttachments} field. */
    public VkSubpassDescription pColorAttachments(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) { npColorAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pResolveAttachments} field. */
    public VkSubpassDescription pResolveAttachments(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) { npResolveAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference} to the {@code pDepthStencilAttachment} field. */
    public VkSubpassDescription pDepthStencilAttachment(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference value) { npDepthStencilAttachment(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pPreserveAttachments} field. */
    public VkSubpassDescription pPreserveAttachments(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npPreserveAttachments(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassDescription set(
        int flags,
        int pipelineBindPoint,
        @Nullable VkAttachmentReference.Buffer pInputAttachments,
        int colorAttachmentCount,
        @Nullable VkAttachmentReference.Buffer pColorAttachments,
        @Nullable VkAttachmentReference.Buffer pResolveAttachments,
        @Nullable VkAttachmentReference pDepthStencilAttachment,
        @Nullable IntBuffer pPreserveAttachments
    ) {
        flags(flags);
        pipelineBindPoint(pipelineBindPoint);
        pInputAttachments(pInputAttachments);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachments(pColorAttachments);
        pResolveAttachments(pResolveAttachments);
        pDepthStencilAttachment(pDepthStencilAttachment);
        pPreserveAttachments(pPreserveAttachments);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassDescription set(VkSubpassDescription src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkSubpassDescription} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDescription malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkSubpassDescription} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDescription calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkSubpassDescription} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDescription create() {
        return new VkSubpassDescription(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkSubpassDescription} instance for the specified memory address. */
    public static VkSubpassDescription create(long address) {
        return new VkSubpassDescription(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDescription createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkSubpassDescription.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDescription.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkSubpassDescription} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSubpassDescription mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkSubpassDescription} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSubpassDescription callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkSubpassDescription} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescription mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescription callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkSubpassDescription.FLAGS); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return memGetInt(struct + VkSubpassDescription.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #inputAttachmentCount}. */
    public static int ninputAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription.INPUTATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pInputAttachments}. */
    @Nullable public static VkAttachmentReference.Buffer npInputAttachments(long struct) { return VkAttachmentReference.createSafe(memGetAddress(struct + VkSubpassDescription.PINPUTATTACHMENTS), ninputAttachmentCount(struct)); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachments}. */
    @Nullable public static VkAttachmentReference.Buffer npColorAttachments(long struct) { return VkAttachmentReference.createSafe(memGetAddress(struct + VkSubpassDescription.PCOLORATTACHMENTS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pResolveAttachments}. */
    @Nullable public static VkAttachmentReference.Buffer npResolveAttachments(long struct) { return VkAttachmentReference.createSafe(memGetAddress(struct + VkSubpassDescription.PRESOLVEATTACHMENTS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pDepthStencilAttachment}. */
    @Nullable public static VkAttachmentReference npDepthStencilAttachment(long struct) { return VkAttachmentReference.createSafe(memGetAddress(struct + VkSubpassDescription.PDEPTHSTENCILATTACHMENT)); }
    /** Unsafe version of {@link #preserveAttachmentCount}. */
    public static int npreserveAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription.PRESERVEATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pPreserveAttachments() pPreserveAttachments}. */
    @Nullable public static IntBuffer npPreserveAttachments(long struct) { return memIntBufferSafe(memGetAddress(struct + VkSubpassDescription.PPRESERVEATTACHMENTS), npreserveAttachmentCount(struct)); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkSubpassDescription.FLAGS, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { memPutInt(struct + VkSubpassDescription.PIPELINEBINDPOINT, value); }
    /** Sets the specified value to the {@code inputAttachmentCount} field of the specified {@code struct}. */
    public static void ninputAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription.INPUTATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pInputAttachments(VkAttachmentReference.Buffer) pInputAttachments}. */
    public static void npInputAttachments(long struct, @Nullable VkAttachmentReference.Buffer value) { memPutAddress(struct + VkSubpassDescription.PINPUTATTACHMENTS, memAddressSafe(value)); ninputAttachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachments(VkAttachmentReference.Buffer) pColorAttachments}. */
    public static void npColorAttachments(long struct, @Nullable VkAttachmentReference.Buffer value) { memPutAddress(struct + VkSubpassDescription.PCOLORATTACHMENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pResolveAttachments(VkAttachmentReference.Buffer) pResolveAttachments}. */
    public static void npResolveAttachments(long struct, @Nullable VkAttachmentReference.Buffer value) { memPutAddress(struct + VkSubpassDescription.PRESOLVEATTACHMENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDepthStencilAttachment(VkAttachmentReference) pDepthStencilAttachment}. */
    public static void npDepthStencilAttachment(long struct, @Nullable VkAttachmentReference value) { memPutAddress(struct + VkSubpassDescription.PDEPTHSTENCILATTACHMENT, memAddressSafe(value)); }
    /** Sets the specified value to the {@code preserveAttachmentCount} field of the specified {@code struct}. */
    public static void npreserveAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription.PRESERVEATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pPreserveAttachments(IntBuffer) pPreserveAttachments}. */
    public static void npPreserveAttachments(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkSubpassDescription.PPRESERVEATTACHMENTS, memAddressSafe(value)); npreserveAttachmentCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ninputAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription.PINPUTATTACHMENTS));
        }
        if (ncolorAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription.PCOLORATTACHMENTS));
        }
        if (npreserveAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription.PPRESERVEATTACHMENTS));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkSubpassDescription} structs. */
    public static class Buffer extends StructBuffer<VkSubpassDescription, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkSubpassDescription.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDescription#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkSubpassDescription newInstance(long address) {
            return new VkSubpassDescription(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code flags} field. */
        @NativeType("VkSubpassDescriptionFlags")
        public int flags() { return VkSubpassDescription.nflags(address()); }
        /** Returns the value of the {@code pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkSubpassDescription.npipelineBindPoint(address()); }
        /** Returns the value of the {@code inputAttachmentCount} field. */
        @NativeType("uint32_t")
        public int inputAttachmentCount() { return VkSubpassDescription.ninputAttachmentCount(address()); }
        /** Returns a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pInputAttachments} field. */
        @Nullable
        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference.Buffer pInputAttachments() { return VkSubpassDescription.npInputAttachments(address()); }
        /** Returns the value of the {@code colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkSubpassDescription.ncolorAttachmentCount(address()); }
        /** Returns a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pColorAttachments} field. */
        @Nullable
        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference.Buffer pColorAttachments() { return VkSubpassDescription.npColorAttachments(address()); }
        /** Returns a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pResolveAttachments} field. */
        @Nullable
        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference.Buffer pResolveAttachments() { return VkSubpassDescription.npResolveAttachments(address()); }
        /** Returns a {@link VkAttachmentReference} view of the struct pointed to by the {@code pDepthStencilAttachment} field. */
        @Nullable
        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference pDepthStencilAttachment() { return VkSubpassDescription.npDepthStencilAttachment(address()); }
        /** Returns the value of the {@code preserveAttachmentCount} field. */
        @NativeType("uint32_t")
        public int preserveAttachmentCount() { return VkSubpassDescription.npreserveAttachmentCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pPreserveAttachments} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pPreserveAttachments() { return VkSubpassDescription.npPreserveAttachments(address()); }

        /** Sets the specified value to the {@code flags} field. */
        public VkSubpassDescription.Buffer flags(@NativeType("VkSubpassDescriptionFlags") int value) { VkSubpassDescription.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBindPoint} field. */
        public VkSubpassDescription.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkSubpassDescription.npipelineBindPoint(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pInputAttachments} field. */
        public VkSubpassDescription.Buffer pInputAttachments(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) { VkSubpassDescription.npInputAttachments(address(), value); return this; }
        /** Sets the specified value to the {@code colorAttachmentCount} field. */
        public VkSubpassDescription.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkSubpassDescription.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pColorAttachments} field. */
        public VkSubpassDescription.Buffer pColorAttachments(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) { VkSubpassDescription.npColorAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pResolveAttachments} field. */
        public VkSubpassDescription.Buffer pResolveAttachments(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) { VkSubpassDescription.npResolveAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference} to the {@code pDepthStencilAttachment} field. */
        public VkSubpassDescription.Buffer pDepthStencilAttachment(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference value) { VkSubpassDescription.npDepthStencilAttachment(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pPreserveAttachments} field. */
        public VkSubpassDescription.Buffer pPreserveAttachments(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkSubpassDescription.npPreserveAttachments(address(), value); return this; }

    }

}