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
 * Structure describing capabilities of extended dynamic state.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceExtendedDynamicState3PropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTExtendedDynamicState3#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceExtendedDynamicState3PropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #dynamicPrimitiveTopologyUnrestricted};
 * }</code></pre>
 */
public class VkPhysicalDeviceExtendedDynamicState3PropertiesEXT extends Struct<VkPhysicalDeviceExtendedDynamicState3PropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DYNAMICPRIMITIVETOPOLOGYUNRESTRICTED;

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
        DYNAMICPRIMITIVETOPOLOGYUNRESTRICTED = layout.offsetof(2);
    }

    protected VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceExtendedDynamicState3PropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExtendedDynamicState3PropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation allows {@code vkCmdSetPrimitiveTopology} to use a different <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#drawing-primitive-topology-class">primitive topology class</a> to the one specified in the active graphics pipeline. */
    @NativeType("VkBool32")
    public boolean dynamicPrimitiveTopologyUnrestricted() { return ndynamicPrimitiveTopologyUnrestricted(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTExtendedDynamicState3#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT sType$Default() { return sType(EXTExtendedDynamicState3.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #dynamicPrimitiveTopologyUnrestricted} field. */
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT dynamicPrimitiveTopologyUnrestricted(@NativeType("VkBool32") boolean value) { ndynamicPrimitiveTopologyUnrestricted(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT set(
        int sType,
        long pNext,
        boolean dynamicPrimitiveTopologyUnrestricted
    ) {
        sType(sType);
        pNext(pNext);
        dynamicPrimitiveTopologyUnrestricted(dynamicPrimitiveTopologyUnrestricted);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT set(VkPhysicalDeviceExtendedDynamicState3PropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState3PropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT malloc() {
        return new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState3PropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT calloc() {
        return new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState3PropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState3PropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT create(long address) {
        return new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedDynamicState3PropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedDynamicState3PropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #dynamicPrimitiveTopologyUnrestricted}. */
    public static int ndynamicPrimitiveTopologyUnrestricted(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.DYNAMICPRIMITIVETOPOLOGYUNRESTRICTED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.PNEXT, value); }
    /** Unsafe version of {@link #dynamicPrimitiveTopologyUnrestricted(boolean) dynamicPrimitiveTopologyUnrestricted}. */
    public static void ndynamicPrimitiveTopologyUnrestricted(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.DYNAMICPRIMITIVETOPOLOGYUNRESTRICTED, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExtendedDynamicState3PropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExtendedDynamicState3PropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExtendedDynamicState3PropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExtendedDynamicState3PropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceExtendedDynamicState3PropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3PropertiesEXT#dynamicPrimitiveTopologyUnrestricted} field. */
        @NativeType("VkBool32")
        public boolean dynamicPrimitiveTopologyUnrestricted() { return VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.ndynamicPrimitiveTopologyUnrestricted(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTExtendedDynamicState3#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer sType$Default() { return sType(EXTExtendedDynamicState3.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3PropertiesEXT#dynamicPrimitiveTopologyUnrestricted} field. */
        public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.Buffer dynamicPrimitiveTopologyUnrestricted(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3PropertiesEXT.ndynamicPrimitiveTopologyUnrestricted(address(), value ? 1 : 0); return this; }

    }

}