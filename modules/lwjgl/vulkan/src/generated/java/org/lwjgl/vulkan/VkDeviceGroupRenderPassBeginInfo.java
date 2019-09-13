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
 * Set the initial device mask and render areas for a render pass instance.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code deviceMask} serves several purposes. It is an upper bound on the set of physical devices that <b>can</b> be used during the render pass instance, and the initial device mask when the render pass instance begins. In addition, commands transitioning to the next subpass in the render pass instance and commands ending the render pass instance, and, accordingly render pass attachment load, store, and resolve operations and subpass dependencies corresponding to the render pass instance, are executed on the physical devices included in the device mask provided here.</p>
 * 
 * <p>If {@code deviceRenderAreaCount} is not zero, then the elements of {@code pDeviceRenderAreas} override the value of {@link VkRenderPassBeginInfo}{@code ::renderArea}, and provide a render area specific to each physical device. These render areas serve the same purpose as {@link VkRenderPassBeginInfo}{@code ::renderArea}, including controlling the region of attachments that are cleared by {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR} and that are resolved into resolve attachments.</p>
 * 
 * <p>If this structure is not present, the render pass instance's device mask is the value of {@link VkDeviceGroupCommandBufferBeginInfo}{@code ::deviceMask}. If this structure is not present or if {@code deviceRenderAreaCount} is zero, {@link VkRenderPassBeginInfo}{@code ::renderArea} is used for all physical devices.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code deviceMask} <b>must</b> be a valid device mask value</li>
 * <li>{@code deviceMask} <b>must</b> not be zero</li>
 * <li>{@code deviceMask} <b>must</b> be a subset of the command buffer&#8217;s initial device mask</li>
 * <li>{@code deviceRenderAreaCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO}</li>
 * <li>If {@code deviceRenderAreaCount} is not 0, {@code pDeviceRenderAreas} <b>must</b> be a valid pointer to an array of {@code deviceRenderAreaCount} {@link VkRect2D} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRect2D}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code deviceMask} &ndash; the device mask for the render pass instance.</li>
 * <li>{@code deviceRenderAreaCount} &ndash; the number of elements in the {@code pDeviceRenderAreas} array.</li>
 * <li>{@code pDeviceRenderAreas} &ndash; a pointer to an array of {@link VkRect2D} structures defining the render area for each physical device.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceGroupRenderPassBeginInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t deviceMask;
 *     uint32_t deviceRenderAreaCount;
 *     {@link VkRect2D VkRect2D} const * pDeviceRenderAreas;
 * }</code></pre>
 */
public class VkDeviceGroupRenderPassBeginInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEMASK,
        DEVICERENDERAREACOUNT,
        PDEVICERENDERAREAS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEMASK = layout.offsetof(2);
        DEVICERENDERAREACOUNT = layout.offsetof(3);
        PDEVICERENDERAREAS = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkDeviceGroupRenderPassBeginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupRenderPassBeginInfo(ByteBuffer container) {
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
    /** Returns the value of the {@code deviceMask} field. */
    @NativeType("uint32_t")
    public int deviceMask() { return ndeviceMask(address()); }
    /** Returns the value of the {@code deviceRenderAreaCount} field. */
    @NativeType("uint32_t")
    public int deviceRenderAreaCount() { return ndeviceRenderAreaCount(address()); }
    /** Returns a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pDeviceRenderAreas} field. */
    @Nullable
    @NativeType("VkRect2D const *")
    public VkRect2D.Buffer pDeviceRenderAreas() { return npDeviceRenderAreas(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceGroupRenderPassBeginInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceGroupRenderPassBeginInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code deviceMask} field. */
    public VkDeviceGroupRenderPassBeginInfo deviceMask(@NativeType("uint32_t") int value) { ndeviceMask(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pDeviceRenderAreas} field. */
    public VkDeviceGroupRenderPassBeginInfo pDeviceRenderAreas(@Nullable @NativeType("VkRect2D const *") VkRect2D.Buffer value) { npDeviceRenderAreas(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGroupRenderPassBeginInfo set(
        int sType,
        long pNext,
        int deviceMask,
        @Nullable VkRect2D.Buffer pDeviceRenderAreas
    ) {
        sType(sType);
        pNext(pNext);
        deviceMask(deviceMask);
        pDeviceRenderAreas(pDeviceRenderAreas);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupRenderPassBeginInfo set(VkDeviceGroupRenderPassBeginInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceGroupRenderPassBeginInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupRenderPassBeginInfo malloc() {
        return wrap(VkDeviceGroupRenderPassBeginInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupRenderPassBeginInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupRenderPassBeginInfo calloc() {
        return wrap(VkDeviceGroupRenderPassBeginInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupRenderPassBeginInfo} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupRenderPassBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceGroupRenderPassBeginInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceGroupRenderPassBeginInfo} instance for the specified memory address. */
    public static VkDeviceGroupRenderPassBeginInfo create(long address) {
        return wrap(VkDeviceGroupRenderPassBeginInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupRenderPassBeginInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceGroupRenderPassBeginInfo.class, address);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceGroupRenderPassBeginInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupRenderPassBeginInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceGroupRenderPassBeginInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDeviceGroupRenderPassBeginInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDeviceGroupRenderPassBeginInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDeviceGroupRenderPassBeginInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDeviceGroupRenderPassBeginInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupRenderPassBeginInfo mallocStack(MemoryStack stack) {
        return wrap(VkDeviceGroupRenderPassBeginInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceGroupRenderPassBeginInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupRenderPassBeginInfo callocStack(MemoryStack stack) {
        return wrap(VkDeviceGroupRenderPassBeginInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupRenderPassBeginInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupRenderPassBeginInfo.PNEXT); }
    /** Unsafe version of {@link #deviceMask}. */
    public static int ndeviceMask(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupRenderPassBeginInfo.DEVICEMASK); }
    /** Unsafe version of {@link #deviceRenderAreaCount}. */
    public static int ndeviceRenderAreaCount(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupRenderPassBeginInfo.DEVICERENDERAREACOUNT); }
    /** Unsafe version of {@link #pDeviceRenderAreas}. */
    @Nullable public static VkRect2D.Buffer npDeviceRenderAreas(long struct) { return VkRect2D.createSafe(memGetAddress(struct + VkDeviceGroupRenderPassBeginInfo.PDEVICERENDERAREAS), ndeviceRenderAreaCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupRenderPassBeginInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupRenderPassBeginInfo.PNEXT, value); }
    /** Unsafe version of {@link #deviceMask(int) deviceMask}. */
    public static void ndeviceMask(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupRenderPassBeginInfo.DEVICEMASK, value); }
    /** Sets the specified value to the {@code deviceRenderAreaCount} field of the specified {@code struct}. */
    public static void ndeviceRenderAreaCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupRenderPassBeginInfo.DEVICERENDERAREACOUNT, value); }
    /** Unsafe version of {@link #pDeviceRenderAreas(VkRect2D.Buffer) pDeviceRenderAreas}. */
    public static void npDeviceRenderAreas(long struct, @Nullable VkRect2D.Buffer value) { memPutAddress(struct + VkDeviceGroupRenderPassBeginInfo.PDEVICERENDERAREAS, memAddressSafe(value)); ndeviceRenderAreaCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndeviceRenderAreaCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceGroupRenderPassBeginInfo.PDEVICERENDERAREAS));
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

    /** An array of {@link VkDeviceGroupRenderPassBeginInfo} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupRenderPassBeginInfo, Buffer> implements NativeResource {

        private static final VkDeviceGroupRenderPassBeginInfo ELEMENT_FACTORY = VkDeviceGroupRenderPassBeginInfo.create(-1L);

        /**
         * Creates a new {@code VkDeviceGroupRenderPassBeginInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupRenderPassBeginInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupRenderPassBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupRenderPassBeginInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceGroupRenderPassBeginInfo.npNext(address()); }
        /** Returns the value of the {@code deviceMask} field. */
        @NativeType("uint32_t")
        public int deviceMask() { return VkDeviceGroupRenderPassBeginInfo.ndeviceMask(address()); }
        /** Returns the value of the {@code deviceRenderAreaCount} field. */
        @NativeType("uint32_t")
        public int deviceRenderAreaCount() { return VkDeviceGroupRenderPassBeginInfo.ndeviceRenderAreaCount(address()); }
        /** Returns a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pDeviceRenderAreas} field. */
        @Nullable
        @NativeType("VkRect2D const *")
        public VkRect2D.Buffer pDeviceRenderAreas() { return VkDeviceGroupRenderPassBeginInfo.npDeviceRenderAreas(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceGroupRenderPassBeginInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupRenderPassBeginInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceGroupRenderPassBeginInfo.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGroupRenderPassBeginInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code deviceMask} field. */
        public VkDeviceGroupRenderPassBeginInfo.Buffer deviceMask(@NativeType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfo.ndeviceMask(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pDeviceRenderAreas} field. */
        public VkDeviceGroupRenderPassBeginInfo.Buffer pDeviceRenderAreas(@Nullable @NativeType("VkRect2D const *") VkRect2D.Buffer value) { VkDeviceGroupRenderPassBeginInfo.npDeviceRenderAreas(address(), value); return this; }

    }

}