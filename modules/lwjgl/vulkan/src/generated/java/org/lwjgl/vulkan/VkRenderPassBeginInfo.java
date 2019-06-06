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
 * Structure specifying render pass begin info.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code renderArea} is the render area that is affected by the render pass instance. The effects of attachment load, store and multisample resolve operations are restricted to the pixels whose x and y coordinates fall within the render area on all attachments. The render area extends to all layers of {@code framebuffer}. The application <b>must</b> ensure (using scissor if necessary) that all rendering is contained within the render area. The render area <b>must</b> be contained within the framebuffer dimensions.</p>
 * 
 * <p>When multiview is enabled, the resolve operation at the end of a subpass applies to all views in the view mask.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>There <b>may</b> be a performance cost for using a render area smaller than the framebuffer, unless it matches the render area granularity for the render pass.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code clearValueCount} <b>must</b> be greater than the largest attachment index in {@code renderPass} that specifies a {@code loadOp} (or {@code stencilLoadOp}, if the attachment has a depth/stencil format) of {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}</li>
 * <li>{@code renderPass} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkFramebufferCreateInfo} structure specified when creating {@code framebuffer}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDeviceGroupRenderPassBeginInfo} or {@link VkRenderPassSampleLocationsBeginInfoEXT}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
 * <li>{@code framebuffer} <b>must</b> be a valid {@code VkFramebuffer} handle</li>
 * <li>If {@code clearValueCount} is not 0, {@code pClearValues} <b>must</b> be a valid pointer to an array of {@code clearValueCount} {@link VkClearValue} unions</li>
 * <li>Both of {@code framebuffer}, and {@code renderPass} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkClearValue}, {@link VkRect2D}, {@link VK10#vkCmdBeginRenderPass CmdBeginRenderPass}, {@link KHRCreateRenderpass2#vkCmdBeginRenderPass2KHR CmdBeginRenderPass2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code renderPass} &ndash; the render pass to begin an instance of.</li>
 * <li>{@code framebuffer} &ndash; the framebuffer containing the attachments that are used with the render pass.</li>
 * <li>{@code renderArea} &ndash; the render area that is affected by the render pass instance, and is described in more detail below.</li>
 * <li>{@code clearValueCount} &ndash; the number of elements in {@code pClearValues}.</li>
 * <li>{@code pClearValues} &ndash; an array of {@link VkClearValue} structures that contains clear values for each attachment, if the attachment uses a {@code loadOp} value of {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR} or if the attachment has a depth/stencil format and uses a {@code stencilLoadOp} value of {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}. The array is indexed by attachment number. Only elements corresponding to cleared attachments are used. Other elements of {@code pClearValues} are ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassBeginInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRenderPass renderPass;
 *     VkFramebuffer framebuffer;
 *     {@link VkRect2D VkRect2D} renderArea;
 *     uint32_t clearValueCount;
 *     {@link VkClearValue VkClearValue} const * pClearValues;
 * }</code></pre>
 */
public class VkRenderPassBeginInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RENDERPASS,
        FRAMEBUFFER,
        RENDERAREA,
        CLEARVALUECOUNT,
        PCLEARVALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RENDERPASS = layout.offsetof(2);
        FRAMEBUFFER = layout.offsetof(3);
        RENDERAREA = layout.offsetof(4);
        CLEARVALUECOUNT = layout.offsetof(5);
        PCLEARVALUES = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkRenderPassBeginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassBeginInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code renderPass} field. */
    @NativeType("VkRenderPass")
    public long renderPass() { return nrenderPass(address()); }
    /** Returns the value of the {@code framebuffer} field. */
    @NativeType("VkFramebuffer")
    public long framebuffer() { return nframebuffer(address()); }
    /** Returns a {@link VkRect2D} view of the {@code renderArea} field. */
    public VkRect2D renderArea() { return nrenderArea(address()); }
    /** Returns the value of the {@code clearValueCount} field. */
    @NativeType("uint32_t")
    public int clearValueCount() { return nclearValueCount(address()); }
    /** Returns a {@link VkClearValue.Buffer} view of the struct array pointed to by the {@code pClearValues} field. */
    @Nullable
    @NativeType("VkClearValue const *")
    public VkClearValue.Buffer pClearValues() { return npClearValues(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassBeginInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassBeginInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code renderPass} field. */
    public VkRenderPassBeginInfo renderPass(@NativeType("VkRenderPass") long value) { nrenderPass(address(), value); return this; }
    /** Sets the specified value to the {@code framebuffer} field. */
    public VkRenderPassBeginInfo framebuffer(@NativeType("VkFramebuffer") long value) { nframebuffer(address(), value); return this; }
    /** Copies the specified {@link VkRect2D} to the {@code renderArea} field. */
    public VkRenderPassBeginInfo renderArea(VkRect2D value) { nrenderArea(address(), value); return this; }
    /** Passes the {@code renderArea} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRenderPassBeginInfo renderArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(renderArea()); return this; }
    /** Sets the address of the specified {@link VkClearValue.Buffer} to the {@code pClearValues} field. */
    public VkRenderPassBeginInfo pClearValues(@Nullable @NativeType("VkClearValue const *") VkClearValue.Buffer value) { npClearValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassBeginInfo set(
        int sType,
        long pNext,
        long renderPass,
        long framebuffer,
        VkRect2D renderArea,
        @Nullable VkClearValue.Buffer pClearValues
    ) {
        sType(sType);
        pNext(pNext);
        renderPass(renderPass);
        framebuffer(framebuffer);
        renderArea(renderArea);
        pClearValues(pClearValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassBeginInfo set(VkRenderPassBeginInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassBeginInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassBeginInfo malloc() {
        return wrap(VkRenderPassBeginInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderPassBeginInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassBeginInfo calloc() {
        return wrap(VkRenderPassBeginInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderPassBeginInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderPassBeginInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassBeginInfo} instance for the specified memory address. */
    public static VkRenderPassBeginInfo create(long address) {
        return wrap(VkRenderPassBeginInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassBeginInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderPassBeginInfo.class, address);
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderPassBeginInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassBeginInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassBeginInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRenderPassBeginInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkRenderPassBeginInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRenderPassBeginInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkRenderPassBeginInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassBeginInfo mallocStack(MemoryStack stack) {
        return wrap(VkRenderPassBeginInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderPassBeginInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassBeginInfo callocStack(MemoryStack stack) {
        return wrap(VkRenderPassBeginInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassBeginInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassBeginInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassBeginInfo.PNEXT); }
    /** Unsafe version of {@link #renderPass}. */
    public static long nrenderPass(long struct) { return UNSAFE.getLong(null, struct + VkRenderPassBeginInfo.RENDERPASS); }
    /** Unsafe version of {@link #framebuffer}. */
    public static long nframebuffer(long struct) { return UNSAFE.getLong(null, struct + VkRenderPassBeginInfo.FRAMEBUFFER); }
    /** Unsafe version of {@link #renderArea}. */
    public static VkRect2D nrenderArea(long struct) { return VkRect2D.create(struct + VkRenderPassBeginInfo.RENDERAREA); }
    /** Unsafe version of {@link #clearValueCount}. */
    public static int nclearValueCount(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassBeginInfo.CLEARVALUECOUNT); }
    /** Unsafe version of {@link #pClearValues}. */
    @Nullable public static VkClearValue.Buffer npClearValues(long struct) { return VkClearValue.createSafe(memGetAddress(struct + VkRenderPassBeginInfo.PCLEARVALUES), nclearValueCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassBeginInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassBeginInfo.PNEXT, value); }
    /** Unsafe version of {@link #renderPass(long) renderPass}. */
    public static void nrenderPass(long struct, long value) { UNSAFE.putLong(null, struct + VkRenderPassBeginInfo.RENDERPASS, value); }
    /** Unsafe version of {@link #framebuffer(long) framebuffer}. */
    public static void nframebuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkRenderPassBeginInfo.FRAMEBUFFER, value); }
    /** Unsafe version of {@link #renderArea(VkRect2D) renderArea}. */
    public static void nrenderArea(long struct, VkRect2D value) { memCopy(value.address(), struct + VkRenderPassBeginInfo.RENDERAREA, VkRect2D.SIZEOF); }
    /** Sets the specified value to the {@code clearValueCount} field of the specified {@code struct}. */
    public static void nclearValueCount(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassBeginInfo.CLEARVALUECOUNT, value); }
    /** Unsafe version of {@link #pClearValues(VkClearValue.Buffer) pClearValues}. */
    public static void npClearValues(long struct, @Nullable VkClearValue.Buffer value) { memPutAddress(struct + VkRenderPassBeginInfo.PCLEARVALUES, memAddressSafe(value)); nclearValueCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nclearValueCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassBeginInfo.PCLEARVALUES));
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
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassBeginInfo} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassBeginInfo, Buffer> implements NativeResource {

        private static final VkRenderPassBeginInfo ELEMENT_FACTORY = VkRenderPassBeginInfo.create(-1L);

        /**
         * Creates a new {@code VkRenderPassBeginInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassBeginInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderPassBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassBeginInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassBeginInfo.npNext(address()); }
        /** Returns the value of the {@code renderPass} field. */
        @NativeType("VkRenderPass")
        public long renderPass() { return VkRenderPassBeginInfo.nrenderPass(address()); }
        /** Returns the value of the {@code framebuffer} field. */
        @NativeType("VkFramebuffer")
        public long framebuffer() { return VkRenderPassBeginInfo.nframebuffer(address()); }
        /** Returns a {@link VkRect2D} view of the {@code renderArea} field. */
        public VkRect2D renderArea() { return VkRenderPassBeginInfo.nrenderArea(address()); }
        /** Returns the value of the {@code clearValueCount} field. */
        @NativeType("uint32_t")
        public int clearValueCount() { return VkRenderPassBeginInfo.nclearValueCount(address()); }
        /** Returns a {@link VkClearValue.Buffer} view of the struct array pointed to by the {@code pClearValues} field. */
        @Nullable
        @NativeType("VkClearValue const *")
        public VkClearValue.Buffer pClearValues() { return VkRenderPassBeginInfo.npClearValues(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassBeginInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassBeginInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassBeginInfo.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassBeginInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code renderPass} field. */
        public VkRenderPassBeginInfo.Buffer renderPass(@NativeType("VkRenderPass") long value) { VkRenderPassBeginInfo.nrenderPass(address(), value); return this; }
        /** Sets the specified value to the {@code framebuffer} field. */
        public VkRenderPassBeginInfo.Buffer framebuffer(@NativeType("VkFramebuffer") long value) { VkRenderPassBeginInfo.nframebuffer(address(), value); return this; }
        /** Copies the specified {@link VkRect2D} to the {@code renderArea} field. */
        public VkRenderPassBeginInfo.Buffer renderArea(VkRect2D value) { VkRenderPassBeginInfo.nrenderArea(address(), value); return this; }
        /** Passes the {@code renderArea} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRenderPassBeginInfo.Buffer renderArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(renderArea()); return this; }
        /** Sets the address of the specified {@link VkClearValue.Buffer} to the {@code pClearValues} field. */
        public VkRenderPassBeginInfo.Buffer pClearValues(@Nullable @NativeType("VkClearValue const *") VkClearValue.Buffer value) { VkRenderPassBeginInfo.npClearValues(address(), value); return this; }

    }

}