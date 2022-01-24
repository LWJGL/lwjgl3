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
 * Structure describing the device-generated diagnostic configuration features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDeviceDiagnosticsConfig#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDiagnosticsConfigFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #diagnosticsConfig};
 * }</code></pre>
 */
public class VkPhysicalDeviceDiagnosticsConfigFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DIAGNOSTICSCONFIG;

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
        DIAGNOSTICSCONFIG = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV(ByteBuffer container) {
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
    /** indicates whether the implementation supports the ability to configure diagnostic tools. */
    @NativeType("VkBool32")
    public boolean diagnosticsConfig() { return ndiagnosticsConfig(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceDiagnosticsConfig#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV sType$Default() { return sType(NVDeviceDiagnosticsConfig.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #diagnosticsConfig} field. */
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV diagnosticsConfig(@NativeType("VkBool32") boolean value) { ndiagnosticsConfig(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV set(
        int sType,
        long pNext,
        boolean diagnosticsConfig
    ) {
        sType(sType);
        pNext(pNext);
        diagnosticsConfig(diagnosticsConfig);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV set(VkPhysicalDeviceDiagnosticsConfigFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV malloc() {
        return wrap(VkPhysicalDeviceDiagnosticsConfigFeaturesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV calloc() {
        return wrap(VkPhysicalDeviceDiagnosticsConfigFeaturesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDiagnosticsConfigFeaturesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV create(long address) {
        return wrap(VkPhysicalDeviceDiagnosticsConfigFeaturesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDiagnosticsConfigFeaturesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDiagnosticsConfigFeaturesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDiagnosticsConfigFeaturesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDiagnosticsConfigFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDiagnosticsConfigFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #diagnosticsConfig}. */
    public static int ndiagnosticsConfig(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDiagnosticsConfigFeaturesNV.DIAGNOSTICSCONFIG); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDiagnosticsConfigFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDiagnosticsConfigFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #diagnosticsConfig(boolean) diagnosticsConfig}. */
    public static void ndiagnosticsConfig(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDiagnosticsConfigFeaturesNV.DIAGNOSTICSCONFIG, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDiagnosticsConfigFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDiagnosticsConfigFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceDiagnosticsConfigFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDiagnosticsConfigFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDiagnosticsConfigFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDiagnosticsConfigFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV#diagnosticsConfig} field. */
        @NativeType("VkBool32")
        public boolean diagnosticsConfig() { return VkPhysicalDeviceDiagnosticsConfigFeaturesNV.ndiagnosticsConfig(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV#sType} field. */
        public VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDiagnosticsConfigFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceDiagnosticsConfig#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV} value to the {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV#sType} field. */
        public VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer sType$Default() { return sType(NVDeviceDiagnosticsConfig.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV#pNext} field. */
        public VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDiagnosticsConfigFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV#diagnosticsConfig} field. */
        public VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer diagnosticsConfig(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDiagnosticsConfigFeaturesNV.ndiagnosticsConfig(address(), value ? 1 : 0); return this; }

    }

}