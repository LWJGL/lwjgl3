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
 * Structure specifying image format properties.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2 STRUCTURE_TYPE_FORMAT_PROPERTIES_2}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDrmFormatModifierPropertiesList2EXT}, {@link VkDrmFormatModifierPropertiesListEXT}, {@link VkFormatProperties3}, {@link VkVideoDecodeH264ProfileEXT}, {@link VkVideoDecodeH265ProfileEXT}, {@link VkVideoEncodeH264ProfileEXT}, {@link VkVideoEncodeH265ProfileEXT}, {@link VkVideoProfileKHR}, or {@link VkVideoProfilesKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkFormatProperties}, {@link VK11#vkGetPhysicalDeviceFormatProperties2 GetPhysicalDeviceFormatProperties2}, {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceFormatProperties2KHR GetPhysicalDeviceFormatProperties2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFormatProperties2 {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkFormatProperties VkFormatProperties} {@link #formatProperties};
 * }</code></pre>
 */
public class VkFormatProperties2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMATPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkFormatProperties.SIZEOF, VkFormatProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMATPROPERTIES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkFormatProperties2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFormatProperties2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@link VkFormatProperties} structure describing features supported by the requested format. */
    public VkFormatProperties formatProperties() { return nformatProperties(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkFormatProperties2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2 STRUCTURE_TYPE_FORMAT_PROPERTIES_2} value to the {@link #sType} field. */
    public VkFormatProperties2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkFormatProperties2 pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDrmFormatModifierPropertiesList2EXT} value to the {@code pNext} chain. */
    public VkFormatProperties2 pNext(VkDrmFormatModifierPropertiesList2EXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDrmFormatModifierPropertiesListEXT} value to the {@code pNext} chain. */
    public VkFormatProperties2 pNext(VkDrmFormatModifierPropertiesListEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkFormatProperties3} value to the {@code pNext} chain. */
    public VkFormatProperties2 pNext(VkFormatProperties3 value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkFormatProperties3KHR} value to the {@code pNext} chain. */
    public VkFormatProperties2 pNext(VkFormatProperties3KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH264ProfileEXT} value to the {@code pNext} chain. */
    public VkFormatProperties2 pNext(VkVideoDecodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265ProfileEXT} value to the {@code pNext} chain. */
    public VkFormatProperties2 pNext(VkVideoDecodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264ProfileEXT} value to the {@code pNext} chain. */
    public VkFormatProperties2 pNext(VkVideoEncodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265ProfileEXT} value to the {@code pNext} chain. */
    public VkFormatProperties2 pNext(VkVideoEncodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoProfileKHR} value to the {@code pNext} chain. */
    public VkFormatProperties2 pNext(VkVideoProfileKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoProfilesKHR} value to the {@code pNext} chain. */
    public VkFormatProperties2 pNext(VkVideoProfilesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkFormatProperties2 set(
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
    public VkFormatProperties2 set(VkFormatProperties2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFormatProperties2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFormatProperties2 malloc() {
        return wrap(VkFormatProperties2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFormatProperties2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFormatProperties2 calloc() {
        return wrap(VkFormatProperties2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFormatProperties2} instance allocated with {@link BufferUtils}. */
    public static VkFormatProperties2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFormatProperties2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFormatProperties2} instance for the specified memory address. */
    public static VkFormatProperties2 create(long address) {
        return wrap(VkFormatProperties2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFormatProperties2 createSafe(long address) {
        return address == NULL ? null : wrap(VkFormatProperties2.class, address);
    }

    /**
     * Returns a new {@link VkFormatProperties2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFormatProperties2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFormatProperties2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkFormatProperties2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFormatProperties2 malloc(MemoryStack stack) {
        return wrap(VkFormatProperties2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFormatProperties2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFormatProperties2 calloc(MemoryStack stack) {
        return wrap(VkFormatProperties2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFormatProperties2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkFormatProperties2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFormatProperties2.PNEXT); }
    /** Unsafe version of {@link #formatProperties}. */
    public static VkFormatProperties nformatProperties(long struct) { return VkFormatProperties.create(struct + VkFormatProperties2.FORMATPROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkFormatProperties2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFormatProperties2.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkFormatProperties2} structs. */
    public static class Buffer extends StructBuffer<VkFormatProperties2, Buffer> implements NativeResource {

        private static final VkFormatProperties2 ELEMENT_FACTORY = VkFormatProperties2.create(-1L);

        /**
         * Creates a new {@code VkFormatProperties2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFormatProperties2#SIZEOF}, and its mark will be undefined.
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
        protected VkFormatProperties2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkFormatProperties2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFormatProperties2.nsType(address()); }
        /** @return the value of the {@link VkFormatProperties2#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkFormatProperties2.npNext(address()); }
        /** @return a {@link VkFormatProperties} view of the {@link VkFormatProperties2#formatProperties} field. */
        public VkFormatProperties formatProperties() { return VkFormatProperties2.nformatProperties(address()); }

        /** Sets the specified value to the {@link VkFormatProperties2#sType} field. */
        public VkFormatProperties2.Buffer sType(@NativeType("VkStructureType") int value) { VkFormatProperties2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2 STRUCTURE_TYPE_FORMAT_PROPERTIES_2} value to the {@link VkFormatProperties2#sType} field. */
        public VkFormatProperties2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2); }
        /** Sets the specified value to the {@link VkFormatProperties2#pNext} field. */
        public VkFormatProperties2.Buffer pNext(@NativeType("void *") long value) { VkFormatProperties2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDrmFormatModifierPropertiesList2EXT} value to the {@code pNext} chain. */
        public VkFormatProperties2.Buffer pNext(VkDrmFormatModifierPropertiesList2EXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDrmFormatModifierPropertiesListEXT} value to the {@code pNext} chain. */
        public VkFormatProperties2.Buffer pNext(VkDrmFormatModifierPropertiesListEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkFormatProperties3} value to the {@code pNext} chain. */
        public VkFormatProperties2.Buffer pNext(VkFormatProperties3 value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkFormatProperties3KHR} value to the {@code pNext} chain. */
        public VkFormatProperties2.Buffer pNext(VkFormatProperties3KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH264ProfileEXT} value to the {@code pNext} chain. */
        public VkFormatProperties2.Buffer pNext(VkVideoDecodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265ProfileEXT} value to the {@code pNext} chain. */
        public VkFormatProperties2.Buffer pNext(VkVideoDecodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264ProfileEXT} value to the {@code pNext} chain. */
        public VkFormatProperties2.Buffer pNext(VkVideoEncodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265ProfileEXT} value to the {@code pNext} chain. */
        public VkFormatProperties2.Buffer pNext(VkVideoEncodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoProfileKHR} value to the {@code pNext} chain. */
        public VkFormatProperties2.Buffer pNext(VkVideoProfileKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoProfilesKHR} value to the {@code pNext} chain. */
        public VkFormatProperties2.Buffer pNext(VkVideoProfilesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}