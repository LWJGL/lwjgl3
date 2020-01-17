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
 * Structure describing multiview features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMultiviewFeatures} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with values indicating whether each feature is supported. {@link VkPhysicalDeviceMultiviewFeatures} <b>can</b> also be included in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable the features.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code multiviewGeometryShader} is enabled then {@code multiview} <b>must</b> also be enabled.</li>
 * <li>If {@code multiviewTessellationShader} is enabled then {@code multiview} <b>must</b> also be enabled.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code multiview} &ndash; specifies whether the implementation supports multiview rendering within a render pass. If this feature is not enabled, the view mask of each subpass <b>must</b> always be zero.</li>
 * <li>{@code multiviewGeometryShader} &ndash; specifies whether the implementation supports multiview rendering within a render pass, with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#geometry">geometry shaders</a>. If this feature is not enabled, then a pipeline compiled against a subpass with a non-zero view mask <b>must</b> not include a geometry shader.</li>
 * <li>{@code multiviewTessellationShader} &ndash; specifies whether the implementation supports multiview rendering within a render pass, with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#tessellation">tessellation shaders</a>. If this feature is not enabled, then a pipeline compiled against a subpass with a non-zero view mask <b>must</b> not include any tessellation shaders.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMultiviewFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 multiview;
 *     VkBool32 multiviewGeometryShader;
 *     VkBool32 multiviewTessellationShader;
 * }</code></pre>
 */
public class VkPhysicalDeviceMultiviewFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MULTIVIEW,
        MULTIVIEWGEOMETRYSHADER,
        MULTIVIEWTESSELLATIONSHADER;

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
        MULTIVIEW = layout.offsetof(2);
        MULTIVIEWGEOMETRYSHADER = layout.offsetof(3);
        MULTIVIEWTESSELLATIONSHADER = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMultiviewFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMultiviewFeatures(ByteBuffer container) {
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
    /** Returns the value of the {@code multiview} field. */
    @NativeType("VkBool32")
    public boolean multiview() { return nmultiview(address()) != 0; }
    /** Returns the value of the {@code multiviewGeometryShader} field. */
    @NativeType("VkBool32")
    public boolean multiviewGeometryShader() { return nmultiviewGeometryShader(address()) != 0; }
    /** Returns the value of the {@code multiviewTessellationShader} field. */
    @NativeType("VkBool32")
    public boolean multiviewTessellationShader() { return nmultiviewTessellationShader(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMultiviewFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMultiviewFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code multiview} field. */
    public VkPhysicalDeviceMultiviewFeatures multiview(@NativeType("VkBool32") boolean value) { nmultiview(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multiviewGeometryShader} field. */
    public VkPhysicalDeviceMultiviewFeatures multiviewGeometryShader(@NativeType("VkBool32") boolean value) { nmultiviewGeometryShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multiviewTessellationShader} field. */
    public VkPhysicalDeviceMultiviewFeatures multiviewTessellationShader(@NativeType("VkBool32") boolean value) { nmultiviewTessellationShader(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMultiviewFeatures set(
        int sType,
        long pNext,
        boolean multiview,
        boolean multiviewGeometryShader,
        boolean multiviewTessellationShader
    ) {
        sType(sType);
        pNext(pNext);
        multiview(multiview);
        multiviewGeometryShader(multiviewGeometryShader);
        multiviewTessellationShader(multiviewTessellationShader);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMultiviewFeatures set(VkPhysicalDeviceMultiviewFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMultiviewFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultiviewFeatures malloc() {
        return wrap(VkPhysicalDeviceMultiviewFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultiviewFeatures calloc() {
        return wrap(VkPhysicalDeviceMultiviewFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMultiviewFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceMultiviewFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceMultiviewFeatures create(long address) {
        return wrap(VkPhysicalDeviceMultiviewFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMultiviewFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceMultiviewFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceMultiviewFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMultiviewFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMultiviewFeatures} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceMultiviewFeatures mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewFeatures} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceMultiviewFeatures callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMultiviewFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultiviewFeatures mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMultiviewFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMultiviewFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultiviewFeatures callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMultiviewFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewFeatures.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewFeatures.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewFeatures.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewFeatures.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewFeatures.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMultiviewFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMultiviewFeatures.PNEXT); }
    /** Unsafe version of {@link #multiview}. */
    public static int nmultiview(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMultiviewFeatures.MULTIVIEW); }
    /** Unsafe version of {@link #multiviewGeometryShader}. */
    public static int nmultiviewGeometryShader(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMultiviewFeatures.MULTIVIEWGEOMETRYSHADER); }
    /** Unsafe version of {@link #multiviewTessellationShader}. */
    public static int nmultiviewTessellationShader(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMultiviewFeatures.MULTIVIEWTESSELLATIONSHADER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMultiviewFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMultiviewFeatures.PNEXT, value); }
    /** Unsafe version of {@link #multiview(boolean) multiview}. */
    public static void nmultiview(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMultiviewFeatures.MULTIVIEW, value); }
    /** Unsafe version of {@link #multiviewGeometryShader(boolean) multiviewGeometryShader}. */
    public static void nmultiviewGeometryShader(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMultiviewFeatures.MULTIVIEWGEOMETRYSHADER, value); }
    /** Unsafe version of {@link #multiviewTessellationShader(boolean) multiviewTessellationShader}. */
    public static void nmultiviewTessellationShader(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMultiviewFeatures.MULTIVIEWTESSELLATIONSHADER, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMultiviewFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMultiviewFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMultiviewFeatures ELEMENT_FACTORY = VkPhysicalDeviceMultiviewFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMultiviewFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMultiviewFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceMultiviewFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMultiviewFeatures.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMultiviewFeatures.npNext(address()); }
        /** Returns the value of the {@code multiview} field. */
        @NativeType("VkBool32")
        public boolean multiview() { return VkPhysicalDeviceMultiviewFeatures.nmultiview(address()) != 0; }
        /** Returns the value of the {@code multiviewGeometryShader} field. */
        @NativeType("VkBool32")
        public boolean multiviewGeometryShader() { return VkPhysicalDeviceMultiviewFeatures.nmultiviewGeometryShader(address()) != 0; }
        /** Returns the value of the {@code multiviewTessellationShader} field. */
        @NativeType("VkBool32")
        public boolean multiviewTessellationShader() { return VkPhysicalDeviceMultiviewFeatures.nmultiviewTessellationShader(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMultiviewFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMultiviewFeatures.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMultiviewFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMultiviewFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code multiview} field. */
        public VkPhysicalDeviceMultiviewFeatures.Buffer multiview(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMultiviewFeatures.nmultiview(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multiviewGeometryShader} field. */
        public VkPhysicalDeviceMultiviewFeatures.Buffer multiviewGeometryShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMultiviewFeatures.nmultiviewGeometryShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multiviewTessellationShader} field. */
        public VkPhysicalDeviceMultiviewFeatures.Buffer multiviewTessellationShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMultiviewFeatures.nmultiviewTessellationShader(address(), value ? 1 : 0); return this; }

    }

}