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
 * Structure providing information about a queue family.
 * 
 * <h5>Description</h5>
 * 
 * <p>The value returned in {@code minImageTransferGranularity} has a unit of compressed texel blocks for images having a block-compressed format, and a unit of texels otherwise.</p>
 * 
 * <p>Possible values of {@code minImageTransferGranularity} are:</p>
 * 
 * <ul>
 * <li><code>(0,0,0)</code> which indicates that only whole mip levels <b>must</b> be transferred using the image transfer operations on the corresponding queues. In this case, the following restrictions apply to all offset and extent parameters of image transfer operations:
 * 
 * <ul>
 * <li>The {@code x}, {@code y}, and {@code z} members of a {@link VkOffset3D} parameter <b>must</b> always be zero.</li>
 * <li>The {@code width}, {@code height}, and {@code depth} members of a {@link VkExtent3D} parameter <b>must</b> always match the width, height, and depth of the image subresource corresponding to the parameter, respectively.</li>
 * </ul>
 * </li>
 * <li><code>(A<sub>x</sub>, A<sub>y</sub>, A<sub>z</sub>)</code> where <code>A<sub>x</sub></code>, <code>A<sub>y</sub></code>, and <code>A<sub>z</sub></code> are all integer powers of two. In this case the following restrictions apply to all image transfer operations:
 * 
 * <ul>
 * <li>{@code x}, {@code y}, and {@code z} of a {@link VkOffset3D} parameter <b>must</b> be integer multiples of <code>A<sub>x</sub></code>, <code>A<sub>y</sub></code>, and <code>A<sub>z</sub></code>, respectively.</li>
 * <li>{@code width} of a {@link VkExtent3D} parameter <b>must</b> be an integer multiple of <code>A<sub>x</sub></code>, or else <code>x + width</code> <b>must</b> equal the width of the image subresource corresponding to the parameter.</li>
 * <li>{@code height} of a {@link VkExtent3D} parameter <b>must</b> be an integer multiple of <code>A<sub>y</sub></code>, or else <code>y + height</code> <b>must</b> equal the height of the image subresource corresponding to the parameter.</li>
 * <li>{@code depth} of a {@link VkExtent3D} parameter <b>must</b> be an integer multiple of <code>A<sub>z</sub></code>, or else <code>z + depth</code> <b>must</b> equal the depth of the image subresource corresponding to the parameter.</li>
 * <li>If the format of the image corresponding to the parameters is one of the block-compressed formats then for the purposes of the above calculations the granularity <b>must</b> be scaled up by the compressed texel block dimensions.</li>
 * </ul>
 * </li>
 * </ul>
 * 
 * <p>Queues supporting graphics and/or compute operations <b>must</b> report <code>(1,1,1)</code> in {@code minImageTransferGranularity}, meaning that there are no additional restrictions on the granularity of image transfer operations for these queues. Other queues supporting image transfer operations are only required: to support whole mip level transfers, thus {@code minImageTransferGranularity} for queues belonging to such queue families <b>may</b> be <code>(0,0,0)</code>.</p>
 * 
 * <p>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#memory-device">Device Memory</a> section describes memory properties queried from the physical device.</p>
 * 
 * <p>For physical device feature queries see the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#features">Features</a> chapter.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent3D}, {@link VkQueueFamilyProperties2}, {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code queueFlags} &ndash; a bitmask of {@code VkQueueFlagBits} indicating capabilities of the queues in this queue family.</li>
 * <li>{@code queueCount} &ndash; the unsigned integer count of queues in this queue family. Each queue family <b>must</b> support at least one queue.</li>
 * <li>{@code timestampValidBits} &ndash; the unsigned integer count of meaningful bits in the timestamps written via {@code vkCmdWriteTimestamp}. The valid range for the count is 36..64 bits, or a value of 0, indicating no support for timestamps. Bits outside the valid range are guaranteed to be zeros.</li>
 * <li>{@code minImageTransferGranularity} &ndash; the minimum granularity supported for image transfer operations on the queues in this queue family.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueueFamilyProperties {
 *     VkQueueFlags queueFlags;
 *     uint32_t queueCount;
 *     uint32_t timestampValidBits;
 *     {@link VkExtent3D VkExtent3D} minImageTransferGranularity;
 * }</code></pre>
 */
public class VkQueueFamilyProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        QUEUEFLAGS,
        QUEUECOUNT,
        TIMESTAMPVALIDBITS,
        MINIMAGETRANSFERGRANULARITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        QUEUEFLAGS = layout.offsetof(0);
        QUEUECOUNT = layout.offsetof(1);
        TIMESTAMPVALIDBITS = layout.offsetof(2);
        MINIMAGETRANSFERGRANULARITY = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkQueueFamilyProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code queueFlags} field. */
    @NativeType("VkQueueFlags")
    public int queueFlags() { return nqueueFlags(address()); }
    /** Returns the value of the {@code queueCount} field. */
    @NativeType("uint32_t")
    public int queueCount() { return nqueueCount(address()); }
    /** Returns the value of the {@code timestampValidBits} field. */
    @NativeType("uint32_t")
    public int timestampValidBits() { return ntimestampValidBits(address()); }
    /** Returns a {@link VkExtent3D} view of the {@code minImageTransferGranularity} field. */
    public VkExtent3D minImageTransferGranularity() { return nminImageTransferGranularity(address()); }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyProperties malloc() {
        return wrap(VkQueueFamilyProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkQueueFamilyProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyProperties calloc() {
        return wrap(VkQueueFamilyProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkQueueFamilyProperties} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkQueueFamilyProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyProperties} instance for the specified memory address. */
    public static VkQueueFamilyProperties create(long address) {
        return wrap(VkQueueFamilyProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkQueueFamilyProperties.class, address);
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkQueueFamilyProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyProperties} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkQueueFamilyProperties mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkQueueFamilyProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkQueueFamilyProperties callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkQueueFamilyProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyProperties mallocStack(MemoryStack stack) {
        return wrap(VkQueueFamilyProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkQueueFamilyProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyProperties callocStack(MemoryStack stack) {
        return wrap(VkQueueFamilyProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #queueFlags}. */
    public static int nqueueFlags(long struct) { return UNSAFE.getInt(null, struct + VkQueueFamilyProperties.QUEUEFLAGS); }
    /** Unsafe version of {@link #queueCount}. */
    public static int nqueueCount(long struct) { return UNSAFE.getInt(null, struct + VkQueueFamilyProperties.QUEUECOUNT); }
    /** Unsafe version of {@link #timestampValidBits}. */
    public static int ntimestampValidBits(long struct) { return UNSAFE.getInt(null, struct + VkQueueFamilyProperties.TIMESTAMPVALIDBITS); }
    /** Unsafe version of {@link #minImageTransferGranularity}. */
    public static VkExtent3D nminImageTransferGranularity(long struct) { return VkExtent3D.create(struct + VkQueueFamilyProperties.MINIMAGETRANSFERGRANULARITY); }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyProperties} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyProperties, Buffer> implements NativeResource {

        private static final VkQueueFamilyProperties ELEMENT_FACTORY = VkQueueFamilyProperties.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkQueueFamilyProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code queueFlags} field. */
        @NativeType("VkQueueFlags")
        public int queueFlags() { return VkQueueFamilyProperties.nqueueFlags(address()); }
        /** Returns the value of the {@code queueCount} field. */
        @NativeType("uint32_t")
        public int queueCount() { return VkQueueFamilyProperties.nqueueCount(address()); }
        /** Returns the value of the {@code timestampValidBits} field. */
        @NativeType("uint32_t")
        public int timestampValidBits() { return VkQueueFamilyProperties.ntimestampValidBits(address()); }
        /** Returns a {@link VkExtent3D} view of the {@code minImageTransferGranularity} field. */
        public VkExtent3D minImageTransferGranularity() { return VkQueueFamilyProperties.nminImageTransferGranularity(address()); }

    }

}