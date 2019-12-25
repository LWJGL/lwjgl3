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
 * Structure describing mesh shading features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMeshShaderFeaturesNV} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with a value indicating whether the feature is supported. {@link VkPhysicalDeviceMeshShaderFeaturesNV} <b>can</b> also be included in {@code pNext} chain of {@link VkDeviceCreateInfo} to enable the features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVMeshShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code taskShader} &ndash; indicates whether the task shader stage is supported.</li>
 * <li>{@code meshShader} &ndash; indicates whether the mesh shader stage is supported.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMeshShaderFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 taskShader;
 *     VkBool32 meshShader;
 * }</code></pre>
 */
public class VkPhysicalDeviceMeshShaderFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TASKSHADER,
        MESHSHADER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TASKSHADER = layout.offsetof(2);
        MESHSHADER = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMeshShaderFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMeshShaderFeaturesNV(ByteBuffer container) {
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
    /** Returns the value of the {@code taskShader} field. */
    @NativeType("VkBool32")
    public boolean taskShader() { return ntaskShader(address()) != 0; }
    /** Returns the value of the {@code meshShader} field. */
    @NativeType("VkBool32")
    public boolean meshShader() { return nmeshShader(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMeshShaderFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMeshShaderFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code taskShader} field. */
    public VkPhysicalDeviceMeshShaderFeaturesNV taskShader(@NativeType("VkBool32") boolean value) { ntaskShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code meshShader} field. */
    public VkPhysicalDeviceMeshShaderFeaturesNV meshShader(@NativeType("VkBool32") boolean value) { nmeshShader(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMeshShaderFeaturesNV set(
        int sType,
        long pNext,
        boolean taskShader,
        boolean meshShader
    ) {
        sType(sType);
        pNext(pNext);
        taskShader(taskShader);
        meshShader(meshShader);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMeshShaderFeaturesNV set(VkPhysicalDeviceMeshShaderFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMeshShaderFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMeshShaderFeaturesNV malloc() {
        return wrap(VkPhysicalDeviceMeshShaderFeaturesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMeshShaderFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMeshShaderFeaturesNV calloc() {
        return wrap(VkPhysicalDeviceMeshShaderFeaturesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMeshShaderFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMeshShaderFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceMeshShaderFeaturesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMeshShaderFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceMeshShaderFeaturesNV create(long address) {
        return wrap(VkPhysicalDeviceMeshShaderFeaturesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMeshShaderFeaturesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceMeshShaderFeaturesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderFeaturesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderFeaturesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceMeshShaderFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderFeaturesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMeshShaderFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMeshShaderFeaturesNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceMeshShaderFeaturesNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceMeshShaderFeaturesNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceMeshShaderFeaturesNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMeshShaderFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMeshShaderFeaturesNV mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMeshShaderFeaturesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMeshShaderFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMeshShaderFeaturesNV callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMeshShaderFeaturesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderFeaturesNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderFeaturesNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderFeaturesNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderFeaturesNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMeshShaderFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #taskShader}. */
    public static int ntaskShader(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesNV.TASKSHADER); }
    /** Unsafe version of {@link #meshShader}. */
    public static int nmeshShader(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesNV.MESHSHADER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMeshShaderFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #taskShader(boolean) taskShader}. */
    public static void ntaskShader(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesNV.TASKSHADER, value); }
    /** Unsafe version of {@link #meshShader(boolean) meshShader}. */
    public static void nmeshShader(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesNV.MESHSHADER, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMeshShaderFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMeshShaderFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMeshShaderFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceMeshShaderFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMeshShaderFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMeshShaderFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceMeshShaderFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMeshShaderFeaturesNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMeshShaderFeaturesNV.npNext(address()); }
        /** Returns the value of the {@code taskShader} field. */
        @NativeType("VkBool32")
        public boolean taskShader() { return VkPhysicalDeviceMeshShaderFeaturesNV.ntaskShader(address()) != 0; }
        /** Returns the value of the {@code meshShader} field. */
        @NativeType("VkBool32")
        public boolean meshShader() { return VkPhysicalDeviceMeshShaderFeaturesNV.nmeshShader(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMeshShaderFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderFeaturesNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMeshShaderFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMeshShaderFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code taskShader} field. */
        public VkPhysicalDeviceMeshShaderFeaturesNV.Buffer taskShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMeshShaderFeaturesNV.ntaskShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code meshShader} field. */
        public VkPhysicalDeviceMeshShaderFeaturesNV.Buffer meshShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMeshShaderFeaturesNV.nmeshShader(address(), value ? 1 : 0); return this; }

    }

}