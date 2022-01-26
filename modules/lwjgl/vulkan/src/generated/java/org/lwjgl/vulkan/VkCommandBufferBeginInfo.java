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
 * Structure specifying a command buffer begin operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code flags} contains {@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}, the {@code framebuffer} member of {@code pInheritanceInfo} <b>must</b> be either {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, or a valid {@code VkFramebuffer} that is compatible with the {@code renderPass} member of {@code pInheritanceInfo}</li>
 * <li>If {@code flags} contains {@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT} and the {@code renderPass} member of {@code pInheritanceInfo} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code renderPass} <b>must</b> be a valid {@code VkRenderPass}</li>
 * <li>If {@code flags} contains {@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT} and the {@code renderPass} member of {@code pInheritanceInfo} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code subpass} member of {@code pInheritanceInfo} <b>must</b> be a valid subpass index within the {@code renderPass} member of {@code pInheritanceInfo}</li>
 * <li>If {@code flags} contains {@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT} and the {@code renderPass} member of {@code pInheritanceInfo} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code pNext} chain of {@code pInheritanceInfo} <b>must</b> include a {@link VkCommandBufferInheritanceRenderingInfo} structure</li>
 * <li>If {@code flags} contains {@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}, the {@code renderPass} member of {@code pInheritanceInfo} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code pNext} chain of {@code pInheritanceInfo} includes a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, the {@code colorAttachmentCount} member of that structure <b>must</b> be equal to the value of {@link VkCommandBufferInheritanceRenderingInfo}{@code ::colorAttachmentCount}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkDeviceGroupCommandBufferBeginInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkCommandBufferUsageFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCommandBufferInheritanceInfo}, {@link VK10#vkBeginCommandBuffer BeginCommandBuffer}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCommandBufferBeginInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkCommandBufferUsageFlags {@link #flags};
 *     {@link VkCommandBufferInheritanceInfo VkCommandBufferInheritanceInfo} const * {@link #pInheritanceInfo};
 * }</code></pre>
 */
public class VkCommandBufferBeginInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PINHERITANCEINFO;

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
        FLAGS = layout.offsetof(2);
        PINHERITANCEINFO = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkCommandBufferBeginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferBeginInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkCommandBufferUsageFlagBits} specifying usage behavior for the command buffer. */
    @NativeType("VkCommandBufferUsageFlags")
    public int flags() { return nflags(address()); }
    /** a pointer to a {@link VkCommandBufferInheritanceInfo} structure, used if {@code commandBuffer} is a secondary command buffer. If this is a primary command buffer, then this value is ignored. */
    @Nullable
    @NativeType("VkCommandBufferInheritanceInfo const *")
    public VkCommandBufferInheritanceInfo pInheritanceInfo() { return npInheritanceInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCommandBufferBeginInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO} value to the {@link #sType} field. */
    public VkCommandBufferBeginInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCommandBufferBeginInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceGroupCommandBufferBeginInfo} value to the {@code pNext} chain. */
    public VkCommandBufferBeginInfo pNext(VkDeviceGroupCommandBufferBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceGroupCommandBufferBeginInfoKHR} value to the {@code pNext} chain. */
    public VkCommandBufferBeginInfo pNext(VkDeviceGroupCommandBufferBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkCommandBufferBeginInfo flags(@NativeType("VkCommandBufferUsageFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkCommandBufferInheritanceInfo} to the {@link #pInheritanceInfo} field. */
    public VkCommandBufferBeginInfo pInheritanceInfo(@Nullable @NativeType("VkCommandBufferInheritanceInfo const *") VkCommandBufferInheritanceInfo value) { npInheritanceInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferBeginInfo set(
        int sType,
        long pNext,
        int flags,
        @Nullable VkCommandBufferInheritanceInfo pInheritanceInfo
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pInheritanceInfo(pInheritanceInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferBeginInfo set(VkCommandBufferBeginInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferBeginInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferBeginInfo malloc() {
        return wrap(VkCommandBufferBeginInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferBeginInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferBeginInfo calloc() {
        return wrap(VkCommandBufferBeginInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferBeginInfo} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCommandBufferBeginInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferBeginInfo} instance for the specified memory address. */
    public static VkCommandBufferBeginInfo create(long address) {
        return wrap(VkCommandBufferBeginInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferBeginInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkCommandBufferBeginInfo.class, address);
    }

    /**
     * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferBeginInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferBeginInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferBeginInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCommandBufferBeginInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferBeginInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferBeginInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCommandBufferBeginInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferBeginInfo malloc(MemoryStack stack) {
        return wrap(VkCommandBufferBeginInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCommandBufferBeginInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferBeginInfo calloc(MemoryStack stack) {
        return wrap(VkCommandBufferBeginInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferBeginInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferBeginInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferBeginInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferBeginInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferBeginInfo.FLAGS); }
    /** Unsafe version of {@link #pInheritanceInfo}. */
    @Nullable public static VkCommandBufferInheritanceInfo npInheritanceInfo(long struct) { return VkCommandBufferInheritanceInfo.createSafe(memGetAddress(struct + VkCommandBufferBeginInfo.PINHERITANCEINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferBeginInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferBeginInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferBeginInfo.FLAGS, value); }
    /** Unsafe version of {@link #pInheritanceInfo(VkCommandBufferInheritanceInfo) pInheritanceInfo}. */
    public static void npInheritanceInfo(long struct, @Nullable VkCommandBufferInheritanceInfo value) { memPutAddress(struct + VkCommandBufferBeginInfo.PINHERITANCEINFO, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkCommandBufferBeginInfo} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferBeginInfo, Buffer> implements NativeResource {

        private static final VkCommandBufferBeginInfo ELEMENT_FACTORY = VkCommandBufferBeginInfo.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferBeginInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferBeginInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkCommandBufferBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCommandBufferBeginInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferBeginInfo.nsType(address()); }
        /** @return the value of the {@link VkCommandBufferBeginInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferBeginInfo.npNext(address()); }
        /** @return the value of the {@link VkCommandBufferBeginInfo#flags} field. */
        @NativeType("VkCommandBufferUsageFlags")
        public int flags() { return VkCommandBufferBeginInfo.nflags(address()); }
        /** @return a {@link VkCommandBufferInheritanceInfo} view of the struct pointed to by the {@link VkCommandBufferBeginInfo#pInheritanceInfo} field. */
        @Nullable
        @NativeType("VkCommandBufferInheritanceInfo const *")
        public VkCommandBufferInheritanceInfo pInheritanceInfo() { return VkCommandBufferBeginInfo.npInheritanceInfo(address()); }

        /** Sets the specified value to the {@link VkCommandBufferBeginInfo#sType} field. */
        public VkCommandBufferBeginInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferBeginInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO} value to the {@link VkCommandBufferBeginInfo#sType} field. */
        public VkCommandBufferBeginInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO); }
        /** Sets the specified value to the {@link VkCommandBufferBeginInfo#pNext} field. */
        public VkCommandBufferBeginInfo.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferBeginInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceGroupCommandBufferBeginInfo} value to the {@code pNext} chain. */
        public VkCommandBufferBeginInfo.Buffer pNext(VkDeviceGroupCommandBufferBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceGroupCommandBufferBeginInfoKHR} value to the {@code pNext} chain. */
        public VkCommandBufferBeginInfo.Buffer pNext(VkDeviceGroupCommandBufferBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkCommandBufferBeginInfo#flags} field. */
        public VkCommandBufferBeginInfo.Buffer flags(@NativeType("VkCommandBufferUsageFlags") int value) { VkCommandBufferBeginInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkCommandBufferInheritanceInfo} to the {@link VkCommandBufferBeginInfo#pInheritanceInfo} field. */
        public VkCommandBufferBeginInfo.Buffer pInheritanceInfo(@Nullable @NativeType("VkCommandBufferInheritanceInfo const *") VkCommandBufferInheritanceInfo value) { VkCommandBufferBeginInfo.npInheritanceInfo(address(), value); return this; }

    }

}