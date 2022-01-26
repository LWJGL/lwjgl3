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
 * Structure specifying parameters of a newly created pipeline color blend state.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-independentBlend">independent blending</a> feature is not enabled, all elements of {@code pAttachments} <b>must</b> be identical</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-logicOp">logic operations</a> feature is not enabled, {@code logicOpEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code logicOpEnable} is {@link VK10#VK_TRUE TRUE}, {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-rasterizationOrderColorAttachmentAccess">{@code rasterizationOrderColorAttachmentAccess}</a> feature is not enabled, {@code flags} <b>must</b> not include {@link ARMRasterizationOrderAttachmentAccess#VK_PIPELINE_COLOR_BLEND_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_BIT_ARM PIPELINE_COLOR_BLEND_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_BIT_ARM}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT} or {@link VkPipelineColorWriteCreateInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkPipelineColorBlendStateCreateFlagBits} values</li>
 * <li>If {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid {@link VkPipelineColorBlendAttachmentState} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGraphicsPipelineCreateInfo}, {@link VkPipelineColorBlendAttachmentState}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineColorBlendStateCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineColorBlendStateCreateFlags {@link #flags};
 *     VkBool32 {@link #logicOpEnable};
 *     VkLogicOp {@link #logicOp};
 *     uint32_t {@link #attachmentCount};
 *     {@link VkPipelineColorBlendAttachmentState VkPipelineColorBlendAttachmentState} const * {@link #pAttachments};
 *     float {@link #blendConstants}[4];
 * }</code></pre>
 */
public class VkPipelineColorBlendStateCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        LOGICOPENABLE,
        LOGICOP,
        ATTACHMENTCOUNT,
        PATTACHMENTS,
        BLENDCONSTANTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __array(4, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        LOGICOPENABLE = layout.offsetof(3);
        LOGICOP = layout.offsetof(4);
        ATTACHMENTCOUNT = layout.offsetof(5);
        PATTACHMENTS = layout.offsetof(6);
        BLENDCONSTANTS = layout.offsetof(7);
    }

    /**
     * Creates a {@code VkPipelineColorBlendStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineColorBlendStateCreateInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkPipelineColorBlendStateCreateFlagBits} specifying additional color blending information. */
    @NativeType("VkPipelineColorBlendStateCreateFlags")
    public int flags() { return nflags(address()); }
    /** controls whether to apply <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-logicop">Logical Operations</a>. */
    @NativeType("VkBool32")
    public boolean logicOpEnable() { return nlogicOpEnable(address()) != 0; }
    /** selects which logical operation to apply. */
    @NativeType("VkLogicOp")
    public int logicOp() { return nlogicOp(address()); }
    /** the number of {@link VkPipelineColorBlendAttachmentState} elements in {@code pAttachments}. */
    @NativeType("uint32_t")
    public int attachmentCount() { return nattachmentCount(address()); }
    /** a pointer to an array of {@link VkPipelineColorBlendAttachmentState} structures defining blend state for each color attachment. */
    @Nullable
    @NativeType("VkPipelineColorBlendAttachmentState const *")
    public VkPipelineColorBlendAttachmentState.Buffer pAttachments() { return npAttachments(address()); }
    /** a pointer to an array of four values used as the R, G, B, and A components of the blend constant that are used in blending, depending on the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-blendfactors">blend factor</a>. */
    @NativeType("float[4]")
    public FloatBuffer blendConstants() { return nblendConstants(address()); }
    /** a pointer to an array of four values used as the R, G, B, and A components of the blend constant that are used in blending, depending on the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-blendfactors">blend factor</a>. */
    public float blendConstants(int index) { return nblendConstants(address(), index); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineColorBlendStateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO} value to the {@link #sType} field. */
    public VkPipelineColorBlendStateCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineColorBlendStateCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT} value to the {@code pNext} chain. */
    public VkPipelineColorBlendStateCreateInfo pNext(VkPipelineColorBlendAdvancedStateCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineColorWriteCreateInfoEXT} value to the {@code pNext} chain. */
    public VkPipelineColorBlendStateCreateInfo pNext(VkPipelineColorWriteCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPipelineColorBlendStateCreateInfo flags(@NativeType("VkPipelineColorBlendStateCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #logicOpEnable} field. */
    public VkPipelineColorBlendStateCreateInfo logicOpEnable(@NativeType("VkBool32") boolean value) { nlogicOpEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #logicOp} field. */
    public VkPipelineColorBlendStateCreateInfo logicOp(@NativeType("VkLogicOp") int value) { nlogicOp(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineColorBlendAttachmentState.Buffer} to the {@link #pAttachments} field. */
    public VkPipelineColorBlendStateCreateInfo pAttachments(@Nullable @NativeType("VkPipelineColorBlendAttachmentState const *") VkPipelineColorBlendAttachmentState.Buffer value) { npAttachments(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@link #blendConstants} field. */
    public VkPipelineColorBlendStateCreateInfo blendConstants(@NativeType("float[4]") FloatBuffer value) { nblendConstants(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #blendConstants} field. */
    public VkPipelineColorBlendStateCreateInfo blendConstants(int index, float value) { nblendConstants(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineColorBlendStateCreateInfo set(
        int sType,
        long pNext,
        int flags,
        boolean logicOpEnable,
        int logicOp,
        @Nullable VkPipelineColorBlendAttachmentState.Buffer pAttachments,
        FloatBuffer blendConstants
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        logicOpEnable(logicOpEnable);
        logicOp(logicOp);
        pAttachments(pAttachments);
        blendConstants(blendConstants);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineColorBlendStateCreateInfo set(VkPipelineColorBlendStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineColorBlendStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineColorBlendStateCreateInfo malloc() {
        return wrap(VkPipelineColorBlendStateCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineColorBlendStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineColorBlendStateCreateInfo calloc() {
        return wrap(VkPipelineColorBlendStateCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineColorBlendStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineColorBlendStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineColorBlendStateCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineColorBlendStateCreateInfo} instance for the specified memory address. */
    public static VkPipelineColorBlendStateCreateInfo create(long address) {
        return wrap(VkPipelineColorBlendStateCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineColorBlendStateCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineColorBlendStateCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendStateCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendStateCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendStateCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendStateCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineColorBlendStateCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendStateCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendStateCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendStateCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendStateCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendStateCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendStateCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendStateCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendStateCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineColorBlendStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorBlendStateCreateInfo malloc(MemoryStack stack) {
        return wrap(VkPipelineColorBlendStateCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineColorBlendStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorBlendStateCreateInfo calloc(MemoryStack stack) {
        return wrap(VkPipelineColorBlendStateCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendStateCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendStateCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineColorBlendStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineColorBlendStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineColorBlendStateCreateInfo.FLAGS); }
    /** Unsafe version of {@link #logicOpEnable}. */
    public static int nlogicOpEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineColorBlendStateCreateInfo.LOGICOPENABLE); }
    /** Unsafe version of {@link #logicOp}. */
    public static int nlogicOp(long struct) { return UNSAFE.getInt(null, struct + VkPipelineColorBlendStateCreateInfo.LOGICOP); }
    /** Unsafe version of {@link #attachmentCount}. */
    public static int nattachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineColorBlendStateCreateInfo.ATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pAttachments}. */
    @Nullable public static VkPipelineColorBlendAttachmentState.Buffer npAttachments(long struct) { return VkPipelineColorBlendAttachmentState.createSafe(memGetAddress(struct + VkPipelineColorBlendStateCreateInfo.PATTACHMENTS), nattachmentCount(struct)); }
    /** Unsafe version of {@link #blendConstants}. */
    public static FloatBuffer nblendConstants(long struct) { return memFloatBuffer(struct + VkPipelineColorBlendStateCreateInfo.BLENDCONSTANTS, 4); }
    /** Unsafe version of {@link #blendConstants(int) blendConstants}. */
    public static float nblendConstants(long struct, int index) {
        return UNSAFE.getFloat(null, struct + VkPipelineColorBlendStateCreateInfo.BLENDCONSTANTS + check(index, 4) * 4);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineColorBlendStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineColorBlendStateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineColorBlendStateCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #logicOpEnable(boolean) logicOpEnable}. */
    public static void nlogicOpEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineColorBlendStateCreateInfo.LOGICOPENABLE, value); }
    /** Unsafe version of {@link #logicOp(int) logicOp}. */
    public static void nlogicOp(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineColorBlendStateCreateInfo.LOGICOP, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineColorBlendStateCreateInfo.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pAttachments(VkPipelineColorBlendAttachmentState.Buffer) pAttachments}. */
    public static void npAttachments(long struct, @Nullable VkPipelineColorBlendAttachmentState.Buffer value) { memPutAddress(struct + VkPipelineColorBlendStateCreateInfo.PATTACHMENTS, memAddressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #blendConstants(FloatBuffer) blendConstants}. */
    public static void nblendConstants(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + VkPipelineColorBlendStateCreateInfo.BLENDCONSTANTS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #blendConstants(int, float) blendConstants}. */
    public static void nblendConstants(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + VkPipelineColorBlendStateCreateInfo.BLENDCONSTANTS + check(index, 4) * 4, value);
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nattachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkPipelineColorBlendStateCreateInfo.PATTACHMENTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineColorBlendStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineColorBlendStateCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineColorBlendStateCreateInfo ELEMENT_FACTORY = VkPipelineColorBlendStateCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineColorBlendStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineColorBlendStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineColorBlendStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineColorBlendStateCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineColorBlendStateCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkPipelineColorBlendStateCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineColorBlendStateCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkPipelineColorBlendStateCreateInfo#flags} field. */
        @NativeType("VkPipelineColorBlendStateCreateFlags")
        public int flags() { return VkPipelineColorBlendStateCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkPipelineColorBlendStateCreateInfo#logicOpEnable} field. */
        @NativeType("VkBool32")
        public boolean logicOpEnable() { return VkPipelineColorBlendStateCreateInfo.nlogicOpEnable(address()) != 0; }
        /** @return the value of the {@link VkPipelineColorBlendStateCreateInfo#logicOp} field. */
        @NativeType("VkLogicOp")
        public int logicOp() { return VkPipelineColorBlendStateCreateInfo.nlogicOp(address()); }
        /** @return the value of the {@link VkPipelineColorBlendStateCreateInfo#attachmentCount} field. */
        @NativeType("uint32_t")
        public int attachmentCount() { return VkPipelineColorBlendStateCreateInfo.nattachmentCount(address()); }
        /** @return a {@link VkPipelineColorBlendAttachmentState.Buffer} view of the struct array pointed to by the {@link VkPipelineColorBlendStateCreateInfo#pAttachments} field. */
        @Nullable
        @NativeType("VkPipelineColorBlendAttachmentState const *")
        public VkPipelineColorBlendAttachmentState.Buffer pAttachments() { return VkPipelineColorBlendStateCreateInfo.npAttachments(address()); }
        /** @return a {@link FloatBuffer} view of the {@link VkPipelineColorBlendStateCreateInfo#blendConstants} field. */
        @NativeType("float[4]")
        public FloatBuffer blendConstants() { return VkPipelineColorBlendStateCreateInfo.nblendConstants(address()); }
        /** @return the value at the specified index of the {@link VkPipelineColorBlendStateCreateInfo#blendConstants} field. */
        public float blendConstants(int index) { return VkPipelineColorBlendStateCreateInfo.nblendConstants(address(), index); }

        /** Sets the specified value to the {@link VkPipelineColorBlendStateCreateInfo#sType} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineColorBlendStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO} value to the {@link VkPipelineColorBlendStateCreateInfo#sType} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkPipelineColorBlendStateCreateInfo#pNext} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineColorBlendStateCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT} value to the {@code pNext} chain. */
        public VkPipelineColorBlendStateCreateInfo.Buffer pNext(VkPipelineColorBlendAdvancedStateCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineColorWriteCreateInfoEXT} value to the {@code pNext} chain. */
        public VkPipelineColorBlendStateCreateInfo.Buffer pNext(VkPipelineColorWriteCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkPipelineColorBlendStateCreateInfo#flags} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer flags(@NativeType("VkPipelineColorBlendStateCreateFlags") int value) { VkPipelineColorBlendStateCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineColorBlendStateCreateInfo#logicOpEnable} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer logicOpEnable(@NativeType("VkBool32") boolean value) { VkPipelineColorBlendStateCreateInfo.nlogicOpEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPipelineColorBlendStateCreateInfo#logicOp} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer logicOp(@NativeType("VkLogicOp") int value) { VkPipelineColorBlendStateCreateInfo.nlogicOp(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineColorBlendAttachmentState.Buffer} to the {@link VkPipelineColorBlendStateCreateInfo#pAttachments} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer pAttachments(@Nullable @NativeType("VkPipelineColorBlendAttachmentState const *") VkPipelineColorBlendAttachmentState.Buffer value) { VkPipelineColorBlendStateCreateInfo.npAttachments(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@link VkPipelineColorBlendStateCreateInfo#blendConstants} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer blendConstants(@NativeType("float[4]") FloatBuffer value) { VkPipelineColorBlendStateCreateInfo.nblendConstants(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link VkPipelineColorBlendStateCreateInfo#blendConstants} field. */
        public VkPipelineColorBlendStateCreateInfo.Buffer blendConstants(int index, float value) { VkPipelineColorBlendStateCreateInfo.nblendConstants(address(), index, value); return this; }

    }

}