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
 * <li>{@code sType} <b>must</b> be {@link EXTToolingInfo#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTToolingInfo#vkGetPhysicalDeviceToolPropertiesEXT GetPhysicalDeviceToolPropertiesEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code name[VK_MAX_EXTENSION_NAME_SIZE]} &ndash; a null-terminated UTF-8 string containing the name of the tool.</li>
 * <li>{@code version[VK_MAX_EXTENSION_NAME_SIZE]} &ndash; a null-terminated UTF-8 string containing the version of the tool.</li>
 * <li>{@code purposes} &ndash; a bitmask of {@code VkToolPurposeFlagBitsEXT} which is populated with purposes supported by the tool.</li>
 * <li>{@code description[VK_MAX_DESCRIPTION_SIZE]} &ndash; a null-terminated UTF-8 string containing a description of the tool.</li>
 * <li>{@code layer[VK_MAX_EXTENSION_NAME_SIZE]} &ndash; a null-terminated UTF-8 string that contains the name of the layer implementing the tool, if the tool is implemented in a layer - otherwise it <b>may</b> be an empty string.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceToolPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     char name[VK_MAX_EXTENSION_NAME_SIZE];
 *     char version[VK_MAX_EXTENSION_NAME_SIZE];
 *     VkToolPurposeFlagsEXT purposes;
 *     char description[VK_MAX_DESCRIPTION_SIZE];
 *     char layer[VK_MAX_EXTENSION_NAME_SIZE];
 * }</code></pre>
 */
public class VkPhysicalDeviceToolPropertiesEXT extends Struct implements NativeResource {

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
     * Creates a {@code VkPhysicalDeviceToolPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceToolPropertiesEXT(ByteBuffer container) {
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
    /** Returns a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer name() { return nname(address()); }
    /** Decodes the null-terminated string stored in the {@code name} field. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public String nameString() { return nnameString(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code version} field. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer version() { return nversion(address()); }
    /** Decodes the null-terminated string stored in the {@code version} field. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public String versionString() { return nversionString(address()); }
    /** Returns the value of the {@code purposes} field. */
    @NativeType("VkToolPurposeFlagsEXT")
    public int purposes() { return npurposes(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** Decodes the null-terminated string stored in the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code layer} field. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer layer() { return nlayer(address()); }
    /** Decodes the null-terminated string stored in the {@code layer} field. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public String layerString() { return nlayerString(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceToolPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceToolPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceToolPropertiesEXT set(
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
    public VkPhysicalDeviceToolPropertiesEXT set(VkPhysicalDeviceToolPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceToolPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceToolPropertiesEXT malloc() {
        return wrap(VkPhysicalDeviceToolPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceToolPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceToolPropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceToolPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceToolPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceToolPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceToolPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceToolPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceToolPropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceToolPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceToolPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceToolPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceToolPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceToolPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceToolPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceToolPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceToolPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceToolPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceToolPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceToolPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceToolPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceToolPropertiesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceToolPropertiesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceToolPropertiesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceToolPropertiesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceToolPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceToolPropertiesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceToolPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceToolPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceToolPropertiesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceToolPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceToolPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceToolPropertiesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceToolPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceToolPropertiesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceToolPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceToolPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceToolPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceToolPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceToolPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceToolPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + VkPhysicalDeviceToolPropertiesEXT.NAME, VK_MAX_EXTENSION_NAME_SIZE); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + VkPhysicalDeviceToolPropertiesEXT.NAME); }
    /** Unsafe version of {@link #version}. */
    public static ByteBuffer nversion(long struct) { return memByteBuffer(struct + VkPhysicalDeviceToolPropertiesEXT.VERSION, VK_MAX_EXTENSION_NAME_SIZE); }
    /** Unsafe version of {@link #versionString}. */
    public static String nversionString(long struct) { return memUTF8(struct + VkPhysicalDeviceToolPropertiesEXT.VERSION); }
    /** Unsafe version of {@link #purposes}. */
    public static int npurposes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceToolPropertiesEXT.PURPOSES); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkPhysicalDeviceToolPropertiesEXT.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkPhysicalDeviceToolPropertiesEXT.DESCRIPTION); }
    /** Unsafe version of {@link #layer}. */
    public static ByteBuffer nlayer(long struct) { return memByteBuffer(struct + VkPhysicalDeviceToolPropertiesEXT.LAYER, VK_MAX_EXTENSION_NAME_SIZE); }
    /** Unsafe version of {@link #layerString}. */
    public static String nlayerString(long struct) { return memUTF8(struct + VkPhysicalDeviceToolPropertiesEXT.LAYER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceToolPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceToolPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceToolPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceToolPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceToolPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceToolPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceToolPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceToolPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceToolPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceToolPropertiesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceToolPropertiesEXT.npNext(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer name() { return VkPhysicalDeviceToolPropertiesEXT.nname(address()); }
        /** Decodes the null-terminated string stored in the {@code name} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public String nameString() { return VkPhysicalDeviceToolPropertiesEXT.nnameString(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code version} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer version() { return VkPhysicalDeviceToolPropertiesEXT.nversion(address()); }
        /** Decodes the null-terminated string stored in the {@code version} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public String versionString() { return VkPhysicalDeviceToolPropertiesEXT.nversionString(address()); }
        /** Returns the value of the {@code purposes} field. */
        @NativeType("VkToolPurposeFlagsEXT")
        public int purposes() { return VkPhysicalDeviceToolPropertiesEXT.npurposes(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkPhysicalDeviceToolPropertiesEXT.ndescription(address()); }
        /** Decodes the null-terminated string stored in the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkPhysicalDeviceToolPropertiesEXT.ndescriptionString(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code layer} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer layer() { return VkPhysicalDeviceToolPropertiesEXT.nlayer(address()); }
        /** Decodes the null-terminated string stored in the {@code layer} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public String layerString() { return VkPhysicalDeviceToolPropertiesEXT.nlayerString(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceToolPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceToolPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceToolPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceToolPropertiesEXT.npNext(address(), value); return this; }

    }

}