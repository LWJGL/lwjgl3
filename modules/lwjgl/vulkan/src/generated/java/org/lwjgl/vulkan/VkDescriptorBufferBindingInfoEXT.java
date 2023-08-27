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
 * Structure specifying descriptor buffer binding information.
 * 
 * <h5>Description</h5>
 * 
 * <p>If a {@link VkPipelineCreateFlags2CreateInfoKHR} structure is present in the {@code pNext} chain, {@link VkPipelineCreateFlags2CreateInfoKHR}{@code ::flags} from that structure is used instead of {@code flags} from this structure.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-bufferlessPushDescriptors">{@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::bufferlessPushDescriptors}</a> is {@link VK10#VK_FALSE FALSE}, and {@code usage} contains {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT}, then the {@code pNext} chain <b>must</b> include a {@link VkDescriptorBufferBindingPushDescriptorBufferHandleEXT} structure</li>
 * <li>{@code address} <b>must</b> be aligned to {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::descriptorBufferOffsetAlignment}</li>
 * <li>If {@code usage} includes {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT}, {@code address} <b>must</b> be an address within a valid buffer that was created with {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT}</li>
 * <li>If {@code usage} includes {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT}, {@code address} <b>must</b> be an address within a valid buffer that was created with {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
 * <li>If {@code usage} includes {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT}, {@code address} <b>must</b> be an address within a valid buffer that was created with {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkBufferUsageFlags2CreateInfoKHR} or {@link VkDescriptorBufferBindingPushDescriptorBufferHandleEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkBufferUsageFlagBits} values</li>
 * <li>{@code usage} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDescriptorBuffer#vkCmdBindDescriptorBuffersEXT CmdBindDescriptorBuffersEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorBufferBindingInfoEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDeviceAddress {@link #address$ address};
 *     VkBufferUsageFlags {@link #usage};
 * }</code></pre>
 */
public class VkDescriptorBufferBindingInfoEXT extends Struct<VkDescriptorBufferBindingInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ADDRESS,
        USAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ADDRESS = layout.offsetof(2);
        USAGE = layout.offsetof(3);
    }

    protected VkDescriptorBufferBindingInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorBufferBindingInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorBufferBindingInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorBufferBindingInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorBufferBindingInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkDeviceAddress} specifying the device address defining the descriptor buffer to be bound. */
    @NativeType("VkDeviceAddress")
    public long address$() { return naddress$(address()); }
    /** a bitmask of {@code VkBufferUsageFlagBits} specifying the {@link VkBufferCreateInfo}{@code ::usage} for the buffer from which {@code address} was queried. */
    @NativeType("VkBufferUsageFlags")
    public int usage() { return nusage(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDescriptorBufferBindingInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT} value to the {@link #sType} field. */
    public VkDescriptorBufferBindingInfoEXT sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDescriptorBufferBindingInfoEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkBufferUsageFlags2CreateInfoKHR} value to the {@code pNext} chain. */
    public VkDescriptorBufferBindingInfoEXT pNext(VkBufferUsageFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDescriptorBufferBindingPushDescriptorBufferHandleEXT} value to the {@code pNext} chain. */
    public VkDescriptorBufferBindingInfoEXT pNext(VkDescriptorBufferBindingPushDescriptorBufferHandleEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #address$} field. */
    public VkDescriptorBufferBindingInfoEXT address$(@NativeType("VkDeviceAddress") long value) { naddress$(address(), value); return this; }
    /** Sets the specified value to the {@link #usage} field. */
    public VkDescriptorBufferBindingInfoEXT usage(@NativeType("VkBufferUsageFlags") int value) { nusage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorBufferBindingInfoEXT set(
        int sType,
        long pNext,
        long address$,
        int usage
    ) {
        sType(sType);
        pNext(pNext);
        address$(address$);
        usage(usage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorBufferBindingInfoEXT set(VkDescriptorBufferBindingInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorBufferBindingInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorBufferBindingInfoEXT malloc() {
        return new VkDescriptorBufferBindingInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorBufferBindingInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorBufferBindingInfoEXT calloc() {
        return new VkDescriptorBufferBindingInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorBufferBindingInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorBufferBindingInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorBufferBindingInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorBufferBindingInfoEXT} instance for the specified memory address. */
    public static VkDescriptorBufferBindingInfoEXT create(long address) {
        return new VkDescriptorBufferBindingInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorBufferBindingInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorBufferBindingInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorBufferBindingInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferBindingInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorBufferBindingInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferBindingInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorBufferBindingInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferBindingInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorBufferBindingInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferBindingInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorBufferBindingInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorBufferBindingInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorBufferBindingInfoEXT malloc(MemoryStack stack) {
        return new VkDescriptorBufferBindingInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorBufferBindingInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorBufferBindingInfoEXT calloc(MemoryStack stack) {
        return new VkDescriptorBufferBindingInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorBufferBindingInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferBindingInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorBufferBindingInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferBindingInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorBufferBindingInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorBufferBindingInfoEXT.PNEXT); }
    /** Unsafe version of {@link #address$}. */
    public static long naddress$(long struct) { return UNSAFE.getLong(null, struct + VkDescriptorBufferBindingInfoEXT.ADDRESS); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorBufferBindingInfoEXT.USAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorBufferBindingInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorBufferBindingInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #address$(long) address$}. */
    public static void naddress$(long struct, long value) { UNSAFE.putLong(null, struct + VkDescriptorBufferBindingInfoEXT.ADDRESS, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorBufferBindingInfoEXT.USAGE, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorBufferBindingInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorBufferBindingInfoEXT, Buffer> implements NativeResource {

        private static final VkDescriptorBufferBindingInfoEXT ELEMENT_FACTORY = VkDescriptorBufferBindingInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorBufferBindingInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorBufferBindingInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorBufferBindingInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorBufferBindingInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorBufferBindingInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDescriptorBufferBindingInfoEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDescriptorBufferBindingInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkDescriptorBufferBindingInfoEXT#address$} field. */
        @NativeType("VkDeviceAddress")
        public long address$() { return VkDescriptorBufferBindingInfoEXT.naddress$(address()); }
        /** @return the value of the {@link VkDescriptorBufferBindingInfoEXT#usage} field. */
        @NativeType("VkBufferUsageFlags")
        public int usage() { return VkDescriptorBufferBindingInfoEXT.nusage(address()); }

        /** Sets the specified value to the {@link VkDescriptorBufferBindingInfoEXT#sType} field. */
        public VkDescriptorBufferBindingInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorBufferBindingInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT} value to the {@link VkDescriptorBufferBindingInfoEXT#sType} field. */
        public VkDescriptorBufferBindingInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT); }
        /** Sets the specified value to the {@link VkDescriptorBufferBindingInfoEXT#pNext} field. */
        public VkDescriptorBufferBindingInfoEXT.Buffer pNext(@NativeType("void *") long value) { VkDescriptorBufferBindingInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkBufferUsageFlags2CreateInfoKHR} value to the {@code pNext} chain. */
        public VkDescriptorBufferBindingInfoEXT.Buffer pNext(VkBufferUsageFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDescriptorBufferBindingPushDescriptorBufferHandleEXT} value to the {@code pNext} chain. */
        public VkDescriptorBufferBindingInfoEXT.Buffer pNext(VkDescriptorBufferBindingPushDescriptorBufferHandleEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkDescriptorBufferBindingInfoEXT#address$} field. */
        public VkDescriptorBufferBindingInfoEXT.Buffer address$(@NativeType("VkDeviceAddress") long value) { VkDescriptorBufferBindingInfoEXT.naddress$(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorBufferBindingInfoEXT#usage} field. */
        public VkDescriptorBufferBindingInfoEXT.Buffer usage(@NativeType("VkBufferUsageFlags") int value) { VkDescriptorBufferBindingInfoEXT.nusage(address(), value); return this; }

    }

}