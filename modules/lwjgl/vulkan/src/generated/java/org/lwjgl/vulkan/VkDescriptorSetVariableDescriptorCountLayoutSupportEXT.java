/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure returning information about whether a descriptor set layout can be supported.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the create info includes a variable-sized descriptor, then {@code supported} is determined assuming the requested size of the variable-sized descriptor, and {@code maxVariableDescriptorCount} is set to the maximum size of that descriptor that <b>can</b> be successfully created (which is greater than or equal to the requested size passed in). If the create info does not include a variable-sized descriptor or if the {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT}{@code ::descriptorBindingVariableDescriptorCount} feature is not enabled, then {@code maxVariableDescriptorCount} is set to zero. For the purposes of this command, a variable-sized descriptor binding with a {@code descriptorCount} of zero is treated as if the {@code descriptorCount} is one, and thus the binding is not ignored and the maximum descriptor count will be returned. If the layout is not supported, then the value written to {@code maxVariableDescriptorCount} is undefined.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDescriptorIndexing#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT_EXT STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT_EXT}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code maxVariableDescriptorCount} &ndash; indicates the maximum number of descriptors supported in the highest numbered binding of the layout, if that binding is variable-sized.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDescriptorSetVariableDescriptorCountLayoutSupportEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxVariableDescriptorCount;
 * }</pre></code>
 */
public class VkDescriptorSetVariableDescriptorCountLayoutSupportEXT extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXVARIABLEDESCRIPTORCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXVARIABLEDESCRIPTORCOUNT = layout.offsetof(2);
    }

    VkDescriptorSetVariableDescriptorCountLayoutSupportEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code maxVariableDescriptorCount} field. */
    @NativeType("uint32_t")
    public int maxVariableDescriptorCount() { return nmaxVariableDescriptorCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT set(
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
    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT set(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT} instance for the specified memory address. */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT create(long address) {
        return new VkDescriptorSetVariableDescriptorCountLayoutSupportEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.PNEXT); }
    /** Unsafe version of {@link #maxVariableDescriptorCount}. */
    public static int nmaxVariableDescriptorCount(long struct) { return memGetInt(struct + VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.MAXVARIABLEDESCRIPTORCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetVariableDescriptorCountLayoutSupportEXT, Buffer> {

        /**
         * Creates a new {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorSetVariableDescriptorCountLayoutSupportEXT newInstance(long address) {
            return new VkDescriptorSetVariableDescriptorCountLayoutSupportEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.npNext(address()); }
        /** Returns the value of the {@code maxVariableDescriptorCount} field. */
        @NativeType("uint32_t")
        public int maxVariableDescriptorCount() { return VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.nmaxVariableDescriptorCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer pNext(@NativeType("void *") long value) { VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.npNext(address(), value); return this; }

    }

}