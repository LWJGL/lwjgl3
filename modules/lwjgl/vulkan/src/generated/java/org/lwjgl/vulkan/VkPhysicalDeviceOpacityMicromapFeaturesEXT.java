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
 * Structure describing the ray tracing opacity micromap features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceOpacityMicromapFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #micromap};
 *     VkBool32 {@link #micromapCaptureReplay};
 *     VkBool32 {@link #micromapHostCommands};
 * }</code></pre>
 */
public class VkPhysicalDeviceOpacityMicromapFeaturesEXT extends Struct<VkPhysicalDeviceOpacityMicromapFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MICROMAP,
        MICROMAPCAPTUREREPLAY,
        MICROMAPHOSTCOMMANDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MICROMAP = layout.offsetof(2);
        MICROMAPCAPTUREREPLAY = layout.offsetof(3);
        MICROMAPHOSTCOMMANDS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceOpacityMicromapFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceOpacityMicromapFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceOpacityMicromapFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT(ByteBuffer container) {
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
    /** indicates whether the implementation supports the micromap array feature. */
    @NativeType("VkBool32")
    public boolean micromap() { return nmicromap(address()) != 0; }
    /** indicates whether the implementation supports capture and replay of addresses for micromap arrays. */
    @NativeType("VkBool32")
    public boolean micromapCaptureReplay() { return nmicromapCaptureReplay(address()) != 0; }
    /** indicates whether the implementation supports host side micromap array commands. */
    @NativeType("VkBool32")
    public boolean micromapHostCommands() { return nmicromapHostCommands(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #micromap} field. */
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromap(@NativeType("VkBool32") boolean value) { nmicromap(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #micromapCaptureReplay} field. */
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapCaptureReplay(@NativeType("VkBool32") boolean value) { nmicromapCaptureReplay(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #micromapHostCommands} field. */
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapHostCommands(@NativeType("VkBool32") boolean value) { nmicromapHostCommands(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT set(
        int sType,
        long pNext,
        boolean micromap,
        boolean micromapCaptureReplay,
        boolean micromapHostCommands
    ) {
        sType(sType);
        pNext(pNext);
        micromap(micromap);
        micromapCaptureReplay(micromapCaptureReplay);
        micromapHostCommands(micromapHostCommands);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT set(VkPhysicalDeviceOpacityMicromapFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceOpacityMicromapFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT malloc() {
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceOpacityMicromapFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT calloc() {
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceOpacityMicromapFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceOpacityMicromapFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT create(long address) {
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceOpacityMicromapFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceOpacityMicromapFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceOpacityMicromapFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpacityMicromapFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceOpacityMicromapFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #micromap}. */
    public static int nmicromap(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpacityMicromapFeaturesEXT.MICROMAP); }
    /** Unsafe version of {@link #micromapCaptureReplay}. */
    public static int nmicromapCaptureReplay(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpacityMicromapFeaturesEXT.MICROMAPCAPTUREREPLAY); }
    /** Unsafe version of {@link #micromapHostCommands}. */
    public static int nmicromapHostCommands(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpacityMicromapFeaturesEXT.MICROMAPHOSTCOMMANDS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceOpacityMicromapFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceOpacityMicromapFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #micromap(boolean) micromap}. */
    public static void nmicromap(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceOpacityMicromapFeaturesEXT.MICROMAP, value); }
    /** Unsafe version of {@link #micromapCaptureReplay(boolean) micromapCaptureReplay}. */
    public static void nmicromapCaptureReplay(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceOpacityMicromapFeaturesEXT.MICROMAPCAPTUREREPLAY, value); }
    /** Unsafe version of {@link #micromapHostCommands(boolean) micromapHostCommands}. */
    public static void nmicromapHostCommands(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceOpacityMicromapFeaturesEXT.MICROMAPHOSTCOMMANDS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceOpacityMicromapFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceOpacityMicromapFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceOpacityMicromapFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceOpacityMicromapFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT#micromap} field. */
        @NativeType("VkBool32")
        public boolean micromap() { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.nmicromap(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT#micromapCaptureReplay} field. */
        @NativeType("VkBool32")
        public boolean micromapCaptureReplay() { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.nmicromapCaptureReplay(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT#micromapHostCommands} field. */
        @NativeType("VkBool32")
        public boolean micromapHostCommands() { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.nmicromapHostCommands(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT#sType} field. */
        public VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT} value to the {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT#sType} field. */
        public VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT#micromap} field. */
        public VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer micromap(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.nmicromap(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT#micromapCaptureReplay} field. */
        public VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer micromapCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.nmicromapCaptureReplay(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT#micromapHostCommands} field. */
        public VkPhysicalDeviceOpacityMicromapFeaturesEXT.Buffer micromapHostCommands(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.nmicromapHostCommands(address(), value ? 1 : 0); return this; }

    }

}