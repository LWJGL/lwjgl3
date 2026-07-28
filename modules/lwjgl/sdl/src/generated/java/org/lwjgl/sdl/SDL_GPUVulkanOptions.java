/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_GPUVulkanOptions {
 *     Uint32 vulkan_api_version;
 *     void * feature_list;
 *     void * vulkan_10_physical_device_features;
 *     Uint32 device_extension_count;
 *     char const ** device_extension_names;
 *     Uint32 instance_extension_count;
 *     char const ** instance_extension_names;
 * }}</pre>
 */
public class SDL_GPUVulkanOptions extends Struct<SDL_GPUVulkanOptions> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VULKAN_API_VERSION,
        FEATURE_LIST,
        VULKAN_10_PHYSICAL_DEVICE_FEATURES,
        DEVICE_EXTENSION_COUNT,
        DEVICE_EXTENSION_NAMES,
        INSTANCE_EXTENSION_COUNT,
        INSTANCE_EXTENSION_NAMES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VULKAN_API_VERSION = layout.offsetof(0);
        FEATURE_LIST = layout.offsetof(1);
        VULKAN_10_PHYSICAL_DEVICE_FEATURES = layout.offsetof(2);
        DEVICE_EXTENSION_COUNT = layout.offsetof(3);
        DEVICE_EXTENSION_NAMES = layout.offsetof(4);
        INSTANCE_EXTENSION_COUNT = layout.offsetof(5);
        INSTANCE_EXTENSION_NAMES = layout.offsetof(6);
    }

    protected SDL_GPUVulkanOptions(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUVulkanOptions create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUVulkanOptions(address, container);
    }

    /**
     * Creates a {@code SDL_GPUVulkanOptions} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUVulkanOptions(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code vulkan_api_version} field. */
    @NativeType("Uint32")
    public int vulkan_api_version() { return nvulkan_api_version(address()); }
    /** @return the value of the {@code feature_list} field. */
    @NativeType("void *")
    public long feature_list() { return nfeature_list(address()); }
    /** @return the value of the {@code vulkan_10_physical_device_features} field. */
    @NativeType("void *")
    public long vulkan_10_physical_device_features() { return nvulkan_10_physical_device_features(address()); }
    /** @return the value of the {@code device_extension_count} field. */
    @NativeType("Uint32")
    public int device_extension_count() { return ndevice_extension_count(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code device_extension_names} field. */
    @NativeType("char const **")
    public @Nullable PointerBuffer device_extension_names() { return ndevice_extension_names(address()); }
    /** @return the value of the {@code instance_extension_count} field. */
    @NativeType("Uint32")
    public int instance_extension_count() { return ninstance_extension_count(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code instance_extension_names} field. */
    @NativeType("char const **")
    public @Nullable PointerBuffer instance_extension_names() { return ninstance_extension_names(address()); }

    /** Sets the specified value to the {@code vulkan_api_version} field. */
    public SDL_GPUVulkanOptions vulkan_api_version(@NativeType("Uint32") int value) { nvulkan_api_version(address(), value); return this; }
    /** Sets the specified value to the {@code feature_list} field. */
    public SDL_GPUVulkanOptions feature_list(@NativeType("void *") long value) { nfeature_list(address(), value); return this; }
    /** Sets the specified value to the {@code vulkan_10_physical_device_features} field. */
    public SDL_GPUVulkanOptions vulkan_10_physical_device_features(@NativeType("void *") long value) { nvulkan_10_physical_device_features(address(), value); return this; }
    /** Sets the specified value to the {@code device_extension_count} field. */
    public SDL_GPUVulkanOptions device_extension_count(@NativeType("Uint32") int value) { ndevice_extension_count(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code device_extension_names} field. */
    public SDL_GPUVulkanOptions device_extension_names(@Nullable @NativeType("char const **") PointerBuffer value) { ndevice_extension_names(address(), value); return this; }
    /** Sets the specified value to the {@code instance_extension_count} field. */
    public SDL_GPUVulkanOptions instance_extension_count(@NativeType("Uint32") int value) { ninstance_extension_count(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code instance_extension_names} field. */
    public SDL_GPUVulkanOptions instance_extension_names(@Nullable @NativeType("char const **") PointerBuffer value) { ninstance_extension_names(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUVulkanOptions set(
        int vulkan_api_version,
        long feature_list,
        long vulkan_10_physical_device_features,
        int device_extension_count,
        @Nullable PointerBuffer device_extension_names,
        int instance_extension_count,
        @Nullable PointerBuffer instance_extension_names
    ) {
        vulkan_api_version(vulkan_api_version);
        feature_list(feature_list);
        vulkan_10_physical_device_features(vulkan_10_physical_device_features);
        device_extension_count(device_extension_count);
        device_extension_names(device_extension_names);
        instance_extension_count(instance_extension_count);
        instance_extension_names(instance_extension_names);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUVulkanOptions set(SDL_GPUVulkanOptions src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUVulkanOptions} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUVulkanOptions malloc() {
        return new SDL_GPUVulkanOptions(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUVulkanOptions} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUVulkanOptions calloc() {
        return new SDL_GPUVulkanOptions(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUVulkanOptions} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUVulkanOptions create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUVulkanOptions(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUVulkanOptions} instance for the specified memory address. */
    public static SDL_GPUVulkanOptions create(long address) {
        return new SDL_GPUVulkanOptions(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUVulkanOptions createSafe(long address) {
        return address == NULL ? null : new SDL_GPUVulkanOptions(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUVulkanOptions.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVulkanOptions.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUVulkanOptions.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVulkanOptions.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUVulkanOptions.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVulkanOptions.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUVulkanOptions.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVulkanOptions.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUVulkanOptions.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUVulkanOptions} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUVulkanOptions malloc(MemoryStack stack) {
        return new SDL_GPUVulkanOptions(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUVulkanOptions} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUVulkanOptions calloc(MemoryStack stack) {
        return new SDL_GPUVulkanOptions(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUVulkanOptions.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVulkanOptions.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUVulkanOptions.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVulkanOptions.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vulkan_api_version}. */
    public static int nvulkan_api_version(long struct) { return memGetInt(struct + SDL_GPUVulkanOptions.VULKAN_API_VERSION); }
    /** Unsafe version of {@link #feature_list}. */
    public static long nfeature_list(long struct) { return memGetAddress(struct + SDL_GPUVulkanOptions.FEATURE_LIST); }
    /** Unsafe version of {@link #vulkan_10_physical_device_features}. */
    public static long nvulkan_10_physical_device_features(long struct) { return memGetAddress(struct + SDL_GPUVulkanOptions.VULKAN_10_PHYSICAL_DEVICE_FEATURES); }
    /** Unsafe version of {@link #device_extension_count}. */
    public static int ndevice_extension_count(long struct) { return memGetInt(struct + SDL_GPUVulkanOptions.DEVICE_EXTENSION_COUNT); }
    /** Unsafe version of {@link #device_extension_names() device_extension_names}. */
    public static @Nullable PointerBuffer ndevice_extension_names(long struct) { return memPointerBufferSafe(memGetAddress(struct + SDL_GPUVulkanOptions.DEVICE_EXTENSION_NAMES), ndevice_extension_count(struct)); }
    /** Unsafe version of {@link #instance_extension_count}. */
    public static int ninstance_extension_count(long struct) { return memGetInt(struct + SDL_GPUVulkanOptions.INSTANCE_EXTENSION_COUNT); }
    /** Unsafe version of {@link #instance_extension_names() instance_extension_names}. */
    public static @Nullable PointerBuffer ninstance_extension_names(long struct) { return memPointerBufferSafe(memGetAddress(struct + SDL_GPUVulkanOptions.INSTANCE_EXTENSION_NAMES), ninstance_extension_count(struct)); }

    /** Unsafe version of {@link #vulkan_api_version(int) vulkan_api_version}. */
    public static void nvulkan_api_version(long struct, int value) { memPutInt(struct + SDL_GPUVulkanOptions.VULKAN_API_VERSION, value); }
    /** Unsafe version of {@link #feature_list(long) feature_list}. */
    public static void nfeature_list(long struct, long value) { memPutAddress(struct + SDL_GPUVulkanOptions.FEATURE_LIST, value); }
    /** Unsafe version of {@link #vulkan_10_physical_device_features(long) vulkan_10_physical_device_features}. */
    public static void nvulkan_10_physical_device_features(long struct, long value) { memPutAddress(struct + SDL_GPUVulkanOptions.VULKAN_10_PHYSICAL_DEVICE_FEATURES, value); }
    /** Sets the specified value to the {@code device_extension_count} field of the specified {@code struct}. */
    public static void ndevice_extension_count(long struct, int value) { memPutInt(struct + SDL_GPUVulkanOptions.DEVICE_EXTENSION_COUNT, value); }
    /** Unsafe version of {@link #device_extension_names(PointerBuffer) device_extension_names}. */
    public static void ndevice_extension_names(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + SDL_GPUVulkanOptions.DEVICE_EXTENSION_NAMES, memAddressSafe(value)); ndevice_extension_count(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code instance_extension_count} field of the specified {@code struct}. */
    public static void ninstance_extension_count(long struct, int value) { memPutInt(struct + SDL_GPUVulkanOptions.INSTANCE_EXTENSION_COUNT, value); }
    /** Unsafe version of {@link #instance_extension_names(PointerBuffer) instance_extension_names}. */
    public static void ninstance_extension_names(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + SDL_GPUVulkanOptions.INSTANCE_EXTENSION_NAMES, memAddressSafe(value)); ninstance_extension_count(struct, value == null ? 0 : value.remaining()); }

    // -----------------------------------

    /** An array of {@link SDL_GPUVulkanOptions} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUVulkanOptions, Buffer> implements NativeResource {

        private static final SDL_GPUVulkanOptions ELEMENT_FACTORY = SDL_GPUVulkanOptions.create(-1L);

        /**
         * Creates a new {@code SDL_GPUVulkanOptions.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUVulkanOptions#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected SDL_GPUVulkanOptions getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code vulkan_api_version} field. */
        @NativeType("Uint32")
        public int vulkan_api_version() { return SDL_GPUVulkanOptions.nvulkan_api_version(address()); }
        /** @return the value of the {@code feature_list} field. */
        @NativeType("void *")
        public long feature_list() { return SDL_GPUVulkanOptions.nfeature_list(address()); }
        /** @return the value of the {@code vulkan_10_physical_device_features} field. */
        @NativeType("void *")
        public long vulkan_10_physical_device_features() { return SDL_GPUVulkanOptions.nvulkan_10_physical_device_features(address()); }
        /** @return the value of the {@code device_extension_count} field. */
        @NativeType("Uint32")
        public int device_extension_count() { return SDL_GPUVulkanOptions.ndevice_extension_count(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code device_extension_names} field. */
        @NativeType("char const **")
        public @Nullable PointerBuffer device_extension_names() { return SDL_GPUVulkanOptions.ndevice_extension_names(address()); }
        /** @return the value of the {@code instance_extension_count} field. */
        @NativeType("Uint32")
        public int instance_extension_count() { return SDL_GPUVulkanOptions.ninstance_extension_count(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code instance_extension_names} field. */
        @NativeType("char const **")
        public @Nullable PointerBuffer instance_extension_names() { return SDL_GPUVulkanOptions.ninstance_extension_names(address()); }

        /** Sets the specified value to the {@code vulkan_api_version} field. */
        public SDL_GPUVulkanOptions.Buffer vulkan_api_version(@NativeType("Uint32") int value) { SDL_GPUVulkanOptions.nvulkan_api_version(address(), value); return this; }
        /** Sets the specified value to the {@code feature_list} field. */
        public SDL_GPUVulkanOptions.Buffer feature_list(@NativeType("void *") long value) { SDL_GPUVulkanOptions.nfeature_list(address(), value); return this; }
        /** Sets the specified value to the {@code vulkan_10_physical_device_features} field. */
        public SDL_GPUVulkanOptions.Buffer vulkan_10_physical_device_features(@NativeType("void *") long value) { SDL_GPUVulkanOptions.nvulkan_10_physical_device_features(address(), value); return this; }
        /** Sets the specified value to the {@code device_extension_count} field. */
        public SDL_GPUVulkanOptions.Buffer device_extension_count(@NativeType("Uint32") int value) { SDL_GPUVulkanOptions.ndevice_extension_count(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code device_extension_names} field. */
        public SDL_GPUVulkanOptions.Buffer device_extension_names(@Nullable @NativeType("char const **") PointerBuffer value) { SDL_GPUVulkanOptions.ndevice_extension_names(address(), value); return this; }
        /** Sets the specified value to the {@code instance_extension_count} field. */
        public SDL_GPUVulkanOptions.Buffer instance_extension_count(@NativeType("Uint32") int value) { SDL_GPUVulkanOptions.ninstance_extension_count(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code instance_extension_names} field. */
        public SDL_GPUVulkanOptions.Buffer instance_extension_names(@Nullable @NativeType("char const **") PointerBuffer value) { SDL_GPUVulkanOptions.ninstance_extension_names(address(), value); return this; }

    }

}