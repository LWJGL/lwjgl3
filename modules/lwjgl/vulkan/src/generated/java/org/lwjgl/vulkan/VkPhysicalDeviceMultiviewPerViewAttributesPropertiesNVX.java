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
 * Structure describing multiview limits that can be supported by an implementation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXMultiviewPerViewAttributes#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX}</li>
 * </ul>
 * 
 * <p>If the {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code perViewPositionAllComponents} &ndash; {@link VK10#VK_TRUE TRUE} if the implementation supports per-view position values that differ in components other than the X component.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 perViewPositionAllComponents;
 * }</code></pre>
 */
public class VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PERVIEWPOSITIONALLCOMPONENTS;

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
        PERVIEWPOSITIONALLCOMPONENTS = layout.offsetof(2);
    }

    VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(ByteBuffer container) {
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
    /** Returns the value of the {@code perViewPositionAllComponents} field. */
    @NativeType("VkBool32")
    public boolean perViewPositionAllComponents() { return nperViewPositionAllComponents(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX set(
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
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX set(VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} instance for the specified memory address. */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX create(long address) {
        return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.PNEXT); }
    /** Unsafe version of {@link #perViewPositionAllComponents}. */
    public static int nperViewPositionAllComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.PERVIEWPOSITIONALLCOMPONENTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX, Buffer> {

        /**
         * Creates a new {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX newInstance(long address) {
            return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.npNext(address()); }
        /** Returns the value of the {@code perViewPositionAllComponents} field. */
        @NativeType("VkBool32")
        public boolean perViewPositionAllComponents() { return VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.nperViewPositionAllComponents(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.npNext(address(), value); return this; }

    }

}