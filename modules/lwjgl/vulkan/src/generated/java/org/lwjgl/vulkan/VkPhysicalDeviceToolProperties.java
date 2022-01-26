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

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure providing information about an active tool.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK13#vkGetPhysicalDeviceToolProperties GetPhysicalDeviceToolProperties}, {@link EXTToolingInfo#vkGetPhysicalDeviceToolPropertiesEXT GetPhysicalDeviceToolPropertiesEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceToolProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     char {@link #name}[VK_MAX_EXTENSION_NAME_SIZE];
 *     char {@link #version}[VK_MAX_EXTENSION_NAME_SIZE];
 *     VkToolPurposeFlags {@link #purposes};
 *     char {@link #description}[VK_MAX_DESCRIPTION_SIZE];
 *     char {@link #layer}[VK_MAX_EXTENSION_NAME_SIZE];
 * }</code></pre>
 */
public class VkPhysicalDeviceToolProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NAME,
        VERSION,
        PURPOSES,
        DESCRIPTION,
        LAYER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_MAX_EXTENSION_NAME_SIZE),
            __array(1, VK_MAX_EXTENSION_NAME_SIZE),
            __member(4),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __array(1, VK_MAX_EXTENSION_NAME_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NAME = layout.offsetof(2);
        VERSION = layout.offsetof(3);
        PURPOSES = layout.offsetof(4);
        DESCRIPTION = layout.offsetof(5);
        LAYER = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkPhysicalDeviceToolProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceToolProperties(ByteBuffer container) {
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
    /** a null-terminated UTF-8 string containing the name of the tool. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer name() { return nname(address()); }
    /** a null-terminated UTF-8 string containing the name of the tool. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public String nameString() { return nnameString(address()); }
    /** a null-terminated UTF-8 string containing the version of the tool. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer version() { return nversion(address()); }
    /** a null-terminated UTF-8 string containing the version of the tool. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public String versionString() { return nversionString(address()); }
    /** a bitmask of {@code VkToolPurposeFlagBits} which is populated with purposes supported by the tool. */
    @NativeType("VkToolPurposeFlags")
    public int purposes() { return npurposes(address()); }
    /** a null-terminated UTF-8 string containing a description of the tool. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** a null-terminated UTF-8 string containing a description of the tool. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }
    /** a null-terminated UTF-8 string containing the name of the layer implementing the tool, if the tool is implemented in a layer - otherwise it <b>may</b> be an empty string. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer layer() { return nlayer(address()); }
    /** a null-terminated UTF-8 string containing the name of the layer implementing the tool, if the tool is implemented in a layer - otherwise it <b>may</b> be an empty string. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public String layerString() { return nlayerString(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceToolProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceToolProperties sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceToolProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceToolProperties set(
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
    public VkPhysicalDeviceToolProperties set(VkPhysicalDeviceToolProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceToolProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceToolProperties malloc() {
        return wrap(VkPhysicalDeviceToolProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceToolProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceToolProperties calloc() {
        return wrap(VkPhysicalDeviceToolProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceToolProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceToolProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceToolProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceToolProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceToolProperties create(long address) {
        return wrap(VkPhysicalDeviceToolProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceToolProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceToolProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceToolProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceToolProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceToolProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceToolProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceToolProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceToolProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceToolProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceToolProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceToolProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceToolProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceToolProperties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceToolProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceToolProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceToolProperties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceToolProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceToolProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceToolProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceToolProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceToolProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceToolProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceToolProperties.PNEXT); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + VkPhysicalDeviceToolProperties.NAME, VK_MAX_EXTENSION_NAME_SIZE); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + VkPhysicalDeviceToolProperties.NAME); }
    /** Unsafe version of {@link #version}. */
    public static ByteBuffer nversion(long struct) { return memByteBuffer(struct + VkPhysicalDeviceToolProperties.VERSION, VK_MAX_EXTENSION_NAME_SIZE); }
    /** Unsafe version of {@link #versionString}. */
    public static String nversionString(long struct) { return memUTF8(struct + VkPhysicalDeviceToolProperties.VERSION); }
    /** Unsafe version of {@link #purposes}. */
    public static int npurposes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceToolProperties.PURPOSES); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkPhysicalDeviceToolProperties.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkPhysicalDeviceToolProperties.DESCRIPTION); }
    /** Unsafe version of {@link #layer}. */
    public static ByteBuffer nlayer(long struct) { return memByteBuffer(struct + VkPhysicalDeviceToolProperties.LAYER, VK_MAX_EXTENSION_NAME_SIZE); }
    /** Unsafe version of {@link #layerString}. */
    public static String nlayerString(long struct) { return memUTF8(struct + VkPhysicalDeviceToolProperties.LAYER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceToolProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceToolProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceToolProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceToolProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceToolProperties ELEMENT_FACTORY = VkPhysicalDeviceToolProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceToolProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceToolProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceToolProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceToolProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceToolProperties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceToolProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceToolProperties.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceToolProperties#name} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer name() { return VkPhysicalDeviceToolProperties.nname(address()); }
        /** @return the null-terminated string stored in the {@link VkPhysicalDeviceToolProperties#name} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public String nameString() { return VkPhysicalDeviceToolProperties.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceToolProperties#version} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer version() { return VkPhysicalDeviceToolProperties.nversion(address()); }
        /** @return the null-terminated string stored in the {@link VkPhysicalDeviceToolProperties#version} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public String versionString() { return VkPhysicalDeviceToolProperties.nversionString(address()); }
        /** @return the value of the {@link VkPhysicalDeviceToolProperties#purposes} field. */
        @NativeType("VkToolPurposeFlags")
        public int purposes() { return VkPhysicalDeviceToolProperties.npurposes(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceToolProperties#description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkPhysicalDeviceToolProperties.ndescription(address()); }
        /** @return the null-terminated string stored in the {@link VkPhysicalDeviceToolProperties#description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkPhysicalDeviceToolProperties.ndescriptionString(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceToolProperties#layer} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer layer() { return VkPhysicalDeviceToolProperties.nlayer(address()); }
        /** @return the null-terminated string stored in the {@link VkPhysicalDeviceToolProperties#layer} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public String layerString() { return VkPhysicalDeviceToolProperties.nlayerString(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceToolProperties#sType} field. */
        public VkPhysicalDeviceToolProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceToolProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES} value to the {@link VkPhysicalDeviceToolProperties#sType} field. */
        public VkPhysicalDeviceToolProperties.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceToolProperties#pNext} field. */
        public VkPhysicalDeviceToolProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceToolProperties.npNext(address(), value); return this; }

    }

}