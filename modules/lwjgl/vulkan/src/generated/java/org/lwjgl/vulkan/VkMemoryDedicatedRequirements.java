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
 * Structure describing dedicated allocation requirements of buffer and image resources.
 * 
 * <h5>Description</h5>
 * 
 * <p>When the implementation sets {@code requiresDedicatedAllocation} to {@link VK10#VK_TRUE TRUE}, it <b>must</b> also set {@code prefersDedicatedAllocation} to {@link VK10#VK_TRUE TRUE}.</p>
 * 
 * <p>If the {@link VkMemoryDedicatedRequirements} structure is included in the {@code pNext} chain of the {@link VkMemoryRequirements2} structure passed as the {@code pMemoryRequirements} parameter of a {@code vkGetBufferMemoryRequirements2} call, {@code requiresDedicatedAllocation} <b>may</b> be {@link VK10#VK_TRUE TRUE} under one of the following conditions:</p>
 * 
 * <ul>
 * <li>The {@code pNext} chain of {@link VkBufferCreateInfo} for the call to {@code vkCreateBuffer} used to create the buffer being queried contained an instance of {@link VkExternalMemoryBufferCreateInfo}, and any of the handle types specified in {@link VkExternalMemoryBufferCreateInfo}{@code ::handleTypes} requires dedicated allocation, as reported by {@link VK11#vkGetPhysicalDeviceExternalBufferProperties GetPhysicalDeviceExternalBufferProperties} in {@link VkExternalBufferProperties}{@code ::externalMemoryProperties}{@code ::externalMemoryFeatures}, the {@code requiresDedicatedAllocation} field will be set to {@link VK10#VK_TRUE TRUE}.</li>
 * </ul>
 * 
 * <p>In all other cases, {@code requiresDedicatedAllocation} <b>must</b> be set to {@link VK10#VK_FALSE FALSE} by the implementation whenever a {@link VkMemoryDedicatedRequirements} structure is included in the {@code pNext} chain of the {@link VkMemoryRequirements2} structure passed to a call to {@code vkGetBufferMemoryRequirements2}.</p>
 * 
 * <p>If the {@link VkMemoryDedicatedRequirements} structure is included in the {@code pNext} chain of the {@link VkMemoryRequirements2} structure passed as the {@code pMemoryRequirements} parameter of a {@code vkGetBufferMemoryRequirements2} call and {@link VK10#VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT} was set in {@link VkBufferCreateInfo}{@code ::flags} when {@code buffer} was created then the implementation <b>must</b> set both {@code prefersDedicatedAllocation} and {@code requiresDedicatedAllocation} to {@link VK10#VK_FALSE FALSE}.</p>
 * 
 * <p>If the {@link VkMemoryDedicatedRequirements} structure is included in the {@code pNext} chain of the {@link VkMemoryRequirements2} structure passed as the {@code pMemoryRequirements} parameter of a {@code vkGetImageMemoryRequirements2} call, {@code requiresDedicatedAllocation} <b>may</b> be {@link VK10#VK_TRUE TRUE} under one of the following conditions:</p>
 * 
 * <ul>
 * <li>The {@code pNext} chain of {@link VkImageCreateInfo} for the call to {@code vkCreateImage} used to create the image being queried contained an instance of {@link VkExternalMemoryImageCreateInfo}, and any of the handle types specified in {@link VkExternalMemoryImageCreateInfo}{@code ::handleTypes} requires dedicated allocation, as reported by {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} in {@link VkExternalImageFormatProperties}{@code ::externalMemoryProperties}{@code ::externalMemoryFeatures}, the {@code requiresDedicatedAllocation} field will be set to {@link VK10#VK_TRUE TRUE}.</li>
 * </ul>
 * 
 * <p>In all other cases, {@code requiresDedicatedAllocation} <b>must</b> be set to {@link VK10#VK_FALSE FALSE} by the implementation whenever a {@link VkMemoryDedicatedRequirements} structure is included in the {@code pNext} chain of the {@link VkMemoryRequirements2} structure passed to a call to {@code vkGetImageMemoryRequirements2}.</p>
 * 
 * <p>If the {@link VkMemoryDedicatedRequirements} structure is included in the {@code pNext} chain of the {@link VkMemoryRequirements2} structure passed as the {@code pMemoryRequirements} parameter of a {@code vkGetImageMemoryRequirements2} call and {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT} was set in {@link VkImageCreateInfo}{@code ::flags} when {@code image} was created then the implementation <b>must</b> set both {@code prefersDedicatedAllocation} and {@code requiresDedicatedAllocation} to {@link VK10#VK_FALSE FALSE}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code prefersDedicatedAllocation} &ndash; specifies that the implementation would prefer a dedicated allocation for this resource. The application is still free to suballocate the resource but it <b>may</b> get better performance if a dedicated allocation is used.</li>
 * <li>{@code requiresDedicatedAllocation} &ndash; specifies that a dedicated allocation is required for this resource.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryDedicatedRequirements {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 prefersDedicatedAllocation;
 *     VkBool32 requiresDedicatedAllocation;
 * }</code></pre>
 */
public class VkMemoryDedicatedRequirements extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PREFERSDEDICATEDALLOCATION,
        REQUIRESDEDICATEDALLOCATION;

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
        PREFERSDEDICATEDALLOCATION = layout.offsetof(2);
        REQUIRESDEDICATEDALLOCATION = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkMemoryDedicatedRequirements} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryDedicatedRequirements(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code prefersDedicatedAllocation} field. */
    @NativeType("VkBool32")
    public boolean prefersDedicatedAllocation() { return nprefersDedicatedAllocation(address()) != 0; }
    /** Returns the value of the {@code requiresDedicatedAllocation} field. */
    @NativeType("VkBool32")
    public boolean requiresDedicatedAllocation() { return nrequiresDedicatedAllocation(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryDedicatedRequirements sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryDedicatedRequirements pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryDedicatedRequirements set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryDedicatedRequirements set(VkMemoryDedicatedRequirements src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryDedicatedRequirements} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryDedicatedRequirements malloc() {
        return wrap(VkMemoryDedicatedRequirements.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMemoryDedicatedRequirements} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryDedicatedRequirements calloc() {
        return wrap(VkMemoryDedicatedRequirements.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMemoryDedicatedRequirements} instance allocated with {@link BufferUtils}. */
    public static VkMemoryDedicatedRequirements create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMemoryDedicatedRequirements.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryDedicatedRequirements} instance for the specified memory address. */
    public static VkMemoryDedicatedRequirements create(long address) {
        return wrap(VkMemoryDedicatedRequirements.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryDedicatedRequirements createSafe(long address) {
        return address == NULL ? null : wrap(VkMemoryDedicatedRequirements.class, address);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirements.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirements.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirements.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirements.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirements.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirements.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMemoryDedicatedRequirements.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirements.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryDedicatedRequirements.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryDedicatedRequirements} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkMemoryDedicatedRequirements mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkMemoryDedicatedRequirements} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkMemoryDedicatedRequirements callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkMemoryDedicatedRequirements} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryDedicatedRequirements mallocStack(MemoryStack stack) {
        return wrap(VkMemoryDedicatedRequirements.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMemoryDedicatedRequirements} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryDedicatedRequirements callocStack(MemoryStack stack) {
        return wrap(VkMemoryDedicatedRequirements.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirements.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirements.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirements.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirements.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirements.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirements.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirements.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirements.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMemoryDedicatedRequirements.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryDedicatedRequirements.PNEXT); }
    /** Unsafe version of {@link #prefersDedicatedAllocation}. */
    public static int nprefersDedicatedAllocation(long struct) { return UNSAFE.getInt(null, struct + VkMemoryDedicatedRequirements.PREFERSDEDICATEDALLOCATION); }
    /** Unsafe version of {@link #requiresDedicatedAllocation}. */
    public static int nrequiresDedicatedAllocation(long struct) { return UNSAFE.getInt(null, struct + VkMemoryDedicatedRequirements.REQUIRESDEDICATEDALLOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryDedicatedRequirements.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryDedicatedRequirements.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryDedicatedRequirements} structs. */
    public static class Buffer extends StructBuffer<VkMemoryDedicatedRequirements, Buffer> implements NativeResource {

        private static final VkMemoryDedicatedRequirements ELEMENT_FACTORY = VkMemoryDedicatedRequirements.create(-1L);

        /**
         * Creates a new {@code VkMemoryDedicatedRequirements.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryDedicatedRequirements#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryDedicatedRequirements getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryDedicatedRequirements.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkMemoryDedicatedRequirements.npNext(address()); }
        /** Returns the value of the {@code prefersDedicatedAllocation} field. */
        @NativeType("VkBool32")
        public boolean prefersDedicatedAllocation() { return VkMemoryDedicatedRequirements.nprefersDedicatedAllocation(address()) != 0; }
        /** Returns the value of the {@code requiresDedicatedAllocation} field. */
        @NativeType("VkBool32")
        public boolean requiresDedicatedAllocation() { return VkMemoryDedicatedRequirements.nrequiresDedicatedAllocation(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryDedicatedRequirements.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryDedicatedRequirements.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryDedicatedRequirements.Buffer pNext(@NativeType("void *") long value) { VkMemoryDedicatedRequirements.npNext(address(), value); return this; }

    }

}