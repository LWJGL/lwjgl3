/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * Vulkan Graphics Device Get Info.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension <b>must</b> be enabled prior to using {@link XrVulkanGraphicsDeviceGetInfoKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHRVulkanEnable2#XR_TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code vulkanInstance} <b>must</b> be a valid {@code VkInstance} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRVulkanEnable2#xrGetVulkanGraphicsDevice2KHR GetVulkanGraphicsDevice2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVulkanGraphicsDeviceGetInfoKHR {
 *     XrStructureType type;
 *     void const * next;
 *     XrSystemId {@link #systemId};
 *     VkInstance {@link #vulkanInstance};
 * }</code></pre>
 */
public class XrVulkanGraphicsDeviceGetInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SYSTEMID,
        VULKANINSTANCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SYSTEMID = layout.offsetof(2);
        VULKANINSTANCE = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrVulkanGraphicsDeviceGetInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVulkanGraphicsDeviceGetInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** an {@code XrSystemId} handle for the system which will be used to create a session. */
    @NativeType("XrSystemId")
    public long systemId() { return nsystemId(address()); }
    /** a valid Vulkan {@code VkInstance}. */
    @NativeType("VkInstance")
    public long vulkanInstance() { return nvulkanInstance(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrVulkanGraphicsDeviceGetInfoKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRVulkanEnable2#XR_TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR} value to the {@code type} field. */
    public XrVulkanGraphicsDeviceGetInfoKHR type$Default() { return type(KHRVulkanEnable2.XR_TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR); }
    /** Sets the specified value to the {@code next} field. */
    public XrVulkanGraphicsDeviceGetInfoKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #systemId} field. */
    public XrVulkanGraphicsDeviceGetInfoKHR systemId(@NativeType("XrSystemId") long value) { nsystemId(address(), value); return this; }
    /** Sets the specified value to the {@link #vulkanInstance} field. */
    public XrVulkanGraphicsDeviceGetInfoKHR vulkanInstance(VkInstance value) { nvulkanInstance(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVulkanGraphicsDeviceGetInfoKHR set(
        int type,
        long next,
        long systemId,
        VkInstance vulkanInstance
    ) {
        type(type);
        next(next);
        systemId(systemId);
        vulkanInstance(vulkanInstance);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVulkanGraphicsDeviceGetInfoKHR set(XrVulkanGraphicsDeviceGetInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVulkanGraphicsDeviceGetInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVulkanGraphicsDeviceGetInfoKHR malloc() {
        return wrap(XrVulkanGraphicsDeviceGetInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrVulkanGraphicsDeviceGetInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVulkanGraphicsDeviceGetInfoKHR calloc() {
        return wrap(XrVulkanGraphicsDeviceGetInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrVulkanGraphicsDeviceGetInfoKHR} instance allocated with {@link BufferUtils}. */
    public static XrVulkanGraphicsDeviceGetInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrVulkanGraphicsDeviceGetInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrVulkanGraphicsDeviceGetInfoKHR} instance for the specified memory address. */
    public static XrVulkanGraphicsDeviceGetInfoKHR create(long address) {
        return wrap(XrVulkanGraphicsDeviceGetInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVulkanGraphicsDeviceGetInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrVulkanGraphicsDeviceGetInfoKHR.class, address);
    }

    /**
     * Returns a new {@link XrVulkanGraphicsDeviceGetInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanGraphicsDeviceGetInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVulkanGraphicsDeviceGetInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanGraphicsDeviceGetInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVulkanGraphicsDeviceGetInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanGraphicsDeviceGetInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrVulkanGraphicsDeviceGetInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVulkanGraphicsDeviceGetInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVulkanGraphicsDeviceGetInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrVulkanGraphicsDeviceGetInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVulkanGraphicsDeviceGetInfoKHR malloc(MemoryStack stack) {
        return wrap(XrVulkanGraphicsDeviceGetInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrVulkanGraphicsDeviceGetInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVulkanGraphicsDeviceGetInfoKHR calloc(MemoryStack stack) {
        return wrap(XrVulkanGraphicsDeviceGetInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrVulkanGraphicsDeviceGetInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVulkanGraphicsDeviceGetInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVulkanGraphicsDeviceGetInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVulkanGraphicsDeviceGetInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrVulkanGraphicsDeviceGetInfoKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVulkanGraphicsDeviceGetInfoKHR.NEXT); }
    /** Unsafe version of {@link #systemId}. */
    public static long nsystemId(long struct) { return UNSAFE.getLong(null, struct + XrVulkanGraphicsDeviceGetInfoKHR.SYSTEMID); }
    /** Unsafe version of {@link #vulkanInstance}. */
    public static long nvulkanInstance(long struct) { return memGetAddress(struct + XrVulkanGraphicsDeviceGetInfoKHR.VULKANINSTANCE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrVulkanGraphicsDeviceGetInfoKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVulkanGraphicsDeviceGetInfoKHR.NEXT, value); }
    /** Unsafe version of {@link #systemId(long) systemId}. */
    public static void nsystemId(long struct, long value) { UNSAFE.putLong(null, struct + XrVulkanGraphicsDeviceGetInfoKHR.SYSTEMID, value); }
    /** Unsafe version of {@link #vulkanInstance(VkInstance) vulkanInstance}. */
    public static void nvulkanInstance(long struct, VkInstance value) { memPutAddress(struct + XrVulkanGraphicsDeviceGetInfoKHR.VULKANINSTANCE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrVulkanGraphicsDeviceGetInfoKHR.VULKANINSTANCE));
    }

    // -----------------------------------

    /** An array of {@link XrVulkanGraphicsDeviceGetInfoKHR} structs. */
    public static class Buffer extends StructBuffer<XrVulkanGraphicsDeviceGetInfoKHR, Buffer> implements NativeResource {

        private static final XrVulkanGraphicsDeviceGetInfoKHR ELEMENT_FACTORY = XrVulkanGraphicsDeviceGetInfoKHR.create(-1L);

        /**
         * Creates a new {@code XrVulkanGraphicsDeviceGetInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVulkanGraphicsDeviceGetInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrVulkanGraphicsDeviceGetInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVulkanGraphicsDeviceGetInfoKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrVulkanGraphicsDeviceGetInfoKHR.nnext(address()); }
        /** @return the value of the {@link XrVulkanGraphicsDeviceGetInfoKHR#systemId} field. */
        @NativeType("XrSystemId")
        public long systemId() { return XrVulkanGraphicsDeviceGetInfoKHR.nsystemId(address()); }
        /** @return the value of the {@link XrVulkanGraphicsDeviceGetInfoKHR#vulkanInstance} field. */
        @NativeType("VkInstance")
        public long vulkanInstance() { return XrVulkanGraphicsDeviceGetInfoKHR.nvulkanInstance(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrVulkanGraphicsDeviceGetInfoKHR.Buffer type(@NativeType("XrStructureType") int value) { XrVulkanGraphicsDeviceGetInfoKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRVulkanEnable2#XR_TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR} value to the {@code type} field. */
        public XrVulkanGraphicsDeviceGetInfoKHR.Buffer type$Default() { return type(KHRVulkanEnable2.XR_TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR); }
        /** Sets the specified value to the {@code next} field. */
        public XrVulkanGraphicsDeviceGetInfoKHR.Buffer next(@NativeType("void const *") long value) { XrVulkanGraphicsDeviceGetInfoKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrVulkanGraphicsDeviceGetInfoKHR#systemId} field. */
        public XrVulkanGraphicsDeviceGetInfoKHR.Buffer systemId(@NativeType("XrSystemId") long value) { XrVulkanGraphicsDeviceGetInfoKHR.nsystemId(address(), value); return this; }
        /** Sets the specified value to the {@link XrVulkanGraphicsDeviceGetInfoKHR#vulkanInstance} field. */
        public XrVulkanGraphicsDeviceGetInfoKHR.Buffer vulkanInstance(VkInstance value) { XrVulkanGraphicsDeviceGetInfoKHR.nvulkanInstance(address(), value); return this; }

    }

}