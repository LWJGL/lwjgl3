/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct glslang_input_t {
 *     glslang_source_t language;
 *     glslang_stage_t stage;
 *     glslang_client_t client;
 *     glslang_target_client_version_t client_version;
 *     glslang_target_language_t target_language;
 *     glslang_target_language_version_t target_language_version;
 *     char const * code;
 *     int default_version;
 *     glslang_profile_t default_profile;
 *     int force_default_version_and_profile;
 *     int forward_compatible;
 *     glslang_messages_t messages;
 *     {@link GLSLangResource glslang_resource_t} const * resource;
 *     {@link GLSLIncludeCallbacks glsl_include_callbacks_t} callbacks;
 *     void * callbacks_ctx;
 * }</code></pre>
 */
@NativeType("struct glslang_input_t")
public class GLSLangInput extends Struct<GLSLangInput> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LANGUAGE,
        STAGE,
        CLIENT,
        CLIENT_VERSION,
        TARGET_LANGUAGE,
        TARGET_LANGUAGE_VERSION,
        CODE,
        DEFAULT_VERSION,
        DEFAULT_PROFILE,
        FORCE_DEFAULT_VERSION_AND_PROFILE,
        FORWARD_COMPATIBLE,
        MESSAGES,
        RESOURCE,
        CALLBACKS,
        CALLBACKS_CTX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(GLSLIncludeCallbacks.SIZEOF, GLSLIncludeCallbacks.ALIGNOF),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LANGUAGE = layout.offsetof(0);
        STAGE = layout.offsetof(1);
        CLIENT = layout.offsetof(2);
        CLIENT_VERSION = layout.offsetof(3);
        TARGET_LANGUAGE = layout.offsetof(4);
        TARGET_LANGUAGE_VERSION = layout.offsetof(5);
        CODE = layout.offsetof(6);
        DEFAULT_VERSION = layout.offsetof(7);
        DEFAULT_PROFILE = layout.offsetof(8);
        FORCE_DEFAULT_VERSION_AND_PROFILE = layout.offsetof(9);
        FORWARD_COMPATIBLE = layout.offsetof(10);
        MESSAGES = layout.offsetof(11);
        RESOURCE = layout.offsetof(12);
        CALLBACKS = layout.offsetof(13);
        CALLBACKS_CTX = layout.offsetof(14);
    }

    protected GLSLangInput(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected GLSLangInput create(long address, @Nullable ByteBuffer container) {
        return new GLSLangInput(address, container);
    }

    /**
     * Creates a {@code GLSLangInput} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GLSLangInput(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code language} field. */
    @NativeType("glslang_source_t")
    public int language() { return nlanguage(address()); }
    /** @return the value of the {@code stage} field. */
    @NativeType("glslang_stage_t")
    public int stage() { return nstage(address()); }
    /** @return the value of the {@code client} field. */
    @NativeType("glslang_client_t")
    public int client() { return nclient(address()); }
    /** @return the value of the {@code client_version} field. */
    @NativeType("glslang_target_client_version_t")
    public int client_version() { return nclient_version(address()); }
    /** @return the value of the {@code target_language} field. */
    @NativeType("glslang_target_language_t")
    public int target_language() { return ntarget_language(address()); }
    /** @return the value of the {@code target_language_version} field. */
    @NativeType("glslang_target_language_version_t")
    public int target_language_version() { return ntarget_language_version(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code code} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer code() { return ncode(address()); }
    /** @return the null-terminated string pointed to by the {@code code} field. */
    @NativeType("char const *")
    public @Nullable String codeString() { return ncodeString(address()); }
    /** @return the value of the {@code default_version} field. */
    public int default_version() { return ndefault_version(address()); }
    /** @return the value of the {@code default_profile} field. */
    @NativeType("glslang_profile_t")
    public int default_profile() { return ndefault_profile(address()); }
    /** @return the value of the {@code force_default_version_and_profile} field. */
    @NativeType("int")
    public boolean force_default_version_and_profile() { return nforce_default_version_and_profile(address()) != 0; }
    /** @return the value of the {@code forward_compatible} field. */
    @NativeType("int")
    public boolean forward_compatible() { return nforward_compatible(address()) != 0; }
    /** @return the value of the {@code messages} field. */
    @NativeType("glslang_messages_t")
    public int messages() { return nmessages(address()); }
    /** @return a {@link GLSLangResource} view of the struct pointed to by the {@code resource} field. */
    @NativeType("glslang_resource_t const *")
    public @Nullable GLSLangResource resource() { return nresource(address()); }
    /** @return a {@link GLSLIncludeCallbacks} view of the {@code callbacks} field. */
    @NativeType("glsl_include_callbacks_t")
    public GLSLIncludeCallbacks callbacks() { return ncallbacks(address()); }
    /** @return the value of the {@code callbacks_ctx} field. */
    @NativeType("void *")
    public long callbacks_ctx() { return ncallbacks_ctx(address()); }

    /** Sets the specified value to the {@code language} field. */
    public GLSLangInput language(@NativeType("glslang_source_t") int value) { nlanguage(address(), value); return this; }
    /** Sets the specified value to the {@code stage} field. */
    public GLSLangInput stage(@NativeType("glslang_stage_t") int value) { nstage(address(), value); return this; }
    /** Sets the specified value to the {@code client} field. */
    public GLSLangInput client(@NativeType("glslang_client_t") int value) { nclient(address(), value); return this; }
    /** Sets the specified value to the {@code client_version} field. */
    public GLSLangInput client_version(@NativeType("glslang_target_client_version_t") int value) { nclient_version(address(), value); return this; }
    /** Sets the specified value to the {@code target_language} field. */
    public GLSLangInput target_language(@NativeType("glslang_target_language_t") int value) { ntarget_language(address(), value); return this; }
    /** Sets the specified value to the {@code target_language_version} field. */
    public GLSLangInput target_language_version(@NativeType("glslang_target_language_version_t") int value) { ntarget_language_version(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code code} field. */
    public GLSLangInput code(@Nullable @NativeType("char const *") ByteBuffer value) { ncode(address(), value); return this; }
    /** Sets the specified value to the {@code default_version} field. */
    public GLSLangInput default_version(int value) { ndefault_version(address(), value); return this; }
    /** Sets the specified value to the {@code default_profile} field. */
    public GLSLangInput default_profile(@NativeType("glslang_profile_t") int value) { ndefault_profile(address(), value); return this; }
    /** Sets the specified value to the {@code force_default_version_and_profile} field. */
    public GLSLangInput force_default_version_and_profile(@NativeType("int") boolean value) { nforce_default_version_and_profile(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code forward_compatible} field. */
    public GLSLangInput forward_compatible(@NativeType("int") boolean value) { nforward_compatible(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code messages} field. */
    public GLSLangInput messages(@NativeType("glslang_messages_t") int value) { nmessages(address(), value); return this; }
    /** Sets the address of the specified {@link GLSLangResource} to the {@code resource} field. */
    public GLSLangInput resource(@Nullable @NativeType("glslang_resource_t const *") GLSLangResource value) { nresource(address(), value); return this; }
    /** Copies the specified {@link GLSLIncludeCallbacks} to the {@code callbacks} field. */
    public GLSLangInput callbacks(@NativeType("glsl_include_callbacks_t") GLSLIncludeCallbacks value) { ncallbacks(address(), value); return this; }
    /** Passes the {@code callbacks} field to the specified {@link java.util.function.Consumer Consumer}. */
    public GLSLangInput callbacks(java.util.function.Consumer<GLSLIncludeCallbacks> consumer) { consumer.accept(callbacks()); return this; }
    /** Sets the specified value to the {@code callbacks_ctx} field. */
    public GLSLangInput callbacks_ctx(@NativeType("void *") long value) { ncallbacks_ctx(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public GLSLangInput set(
        int language,
        int stage,
        int client,
        int client_version,
        int target_language,
        int target_language_version,
        @Nullable ByteBuffer code,
        int default_version,
        int default_profile,
        boolean force_default_version_and_profile,
        boolean forward_compatible,
        int messages,
        @Nullable GLSLangResource resource,
        GLSLIncludeCallbacks callbacks,
        long callbacks_ctx
    ) {
        language(language);
        stage(stage);
        client(client);
        client_version(client_version);
        target_language(target_language);
        target_language_version(target_language_version);
        code(code);
        default_version(default_version);
        default_profile(default_profile);
        force_default_version_and_profile(force_default_version_and_profile);
        forward_compatible(forward_compatible);
        messages(messages);
        resource(resource);
        callbacks(callbacks);
        callbacks_ctx(callbacks_ctx);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public GLSLangInput set(GLSLangInput src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code GLSLangInput} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static GLSLangInput malloc() {
        return new GLSLangInput(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code GLSLangInput} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static GLSLangInput calloc() {
        return new GLSLangInput(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code GLSLangInput} instance allocated with {@link BufferUtils}. */
    public static GLSLangInput create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLSLangInput(memAddress(container), container);
    }

    /** Returns a new {@code GLSLangInput} instance for the specified memory address. */
    public static GLSLangInput create(long address) {
        return new GLSLangInput(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable GLSLangInput createSafe(long address) {
        return address == NULL ? null : new GLSLangInput(address, null);
    }

    /**
     * Returns a new {@link GLSLangInput.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangInput.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link GLSLangInput.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangInput.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLSLangInput.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangInput.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link GLSLangInput.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GLSLangInput.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static GLSLangInput.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code GLSLangInput} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static GLSLangInput malloc(MemoryStack stack) {
        return new GLSLangInput(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code GLSLangInput} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static GLSLangInput calloc(MemoryStack stack) {
        return new GLSLangInput(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link GLSLangInput.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLSLangInput.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLSLangInput.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLSLangInput.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #language}. */
    public static int nlanguage(long struct) { return memGetInt(struct + GLSLangInput.LANGUAGE); }
    /** Unsafe version of {@link #stage}. */
    public static int nstage(long struct) { return memGetInt(struct + GLSLangInput.STAGE); }
    /** Unsafe version of {@link #client}. */
    public static int nclient(long struct) { return memGetInt(struct + GLSLangInput.CLIENT); }
    /** Unsafe version of {@link #client_version}. */
    public static int nclient_version(long struct) { return memGetInt(struct + GLSLangInput.CLIENT_VERSION); }
    /** Unsafe version of {@link #target_language}. */
    public static int ntarget_language(long struct) { return memGetInt(struct + GLSLangInput.TARGET_LANGUAGE); }
    /** Unsafe version of {@link #target_language_version}. */
    public static int ntarget_language_version(long struct) { return memGetInt(struct + GLSLangInput.TARGET_LANGUAGE_VERSION); }
    /** Unsafe version of {@link #code}. */
    public static @Nullable ByteBuffer ncode(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + GLSLangInput.CODE)); }
    /** Unsafe version of {@link #codeString}. */
    public static @Nullable String ncodeString(long struct) { return memUTF8Safe(memGetAddress(struct + GLSLangInput.CODE)); }
    /** Unsafe version of {@link #default_version}. */
    public static int ndefault_version(long struct) { return memGetInt(struct + GLSLangInput.DEFAULT_VERSION); }
    /** Unsafe version of {@link #default_profile}. */
    public static int ndefault_profile(long struct) { return memGetInt(struct + GLSLangInput.DEFAULT_PROFILE); }
    /** Unsafe version of {@link #force_default_version_and_profile}. */
    public static int nforce_default_version_and_profile(long struct) { return memGetInt(struct + GLSLangInput.FORCE_DEFAULT_VERSION_AND_PROFILE); }
    /** Unsafe version of {@link #forward_compatible}. */
    public static int nforward_compatible(long struct) { return memGetInt(struct + GLSLangInput.FORWARD_COMPATIBLE); }
    /** Unsafe version of {@link #messages}. */
    public static int nmessages(long struct) { return memGetInt(struct + GLSLangInput.MESSAGES); }
    /** Unsafe version of {@link #resource}. */
    public static @Nullable GLSLangResource nresource(long struct) { return GLSLangResource.createSafe(memGetAddress(struct + GLSLangInput.RESOURCE)); }
    /** Unsafe version of {@link #callbacks}. */
    public static GLSLIncludeCallbacks ncallbacks(long struct) { return GLSLIncludeCallbacks.create(struct + GLSLangInput.CALLBACKS); }
    /** Unsafe version of {@link #callbacks_ctx}. */
    public static long ncallbacks_ctx(long struct) { return memGetAddress(struct + GLSLangInput.CALLBACKS_CTX); }

    /** Unsafe version of {@link #language(int) language}. */
    public static void nlanguage(long struct, int value) { memPutInt(struct + GLSLangInput.LANGUAGE, value); }
    /** Unsafe version of {@link #stage(int) stage}. */
    public static void nstage(long struct, int value) { memPutInt(struct + GLSLangInput.STAGE, value); }
    /** Unsafe version of {@link #client(int) client}. */
    public static void nclient(long struct, int value) { memPutInt(struct + GLSLangInput.CLIENT, value); }
    /** Unsafe version of {@link #client_version(int) client_version}. */
    public static void nclient_version(long struct, int value) { memPutInt(struct + GLSLangInput.CLIENT_VERSION, value); }
    /** Unsafe version of {@link #target_language(int) target_language}. */
    public static void ntarget_language(long struct, int value) { memPutInt(struct + GLSLangInput.TARGET_LANGUAGE, value); }
    /** Unsafe version of {@link #target_language_version(int) target_language_version}. */
    public static void ntarget_language_version(long struct, int value) { memPutInt(struct + GLSLangInput.TARGET_LANGUAGE_VERSION, value); }
    /** Unsafe version of {@link #code(ByteBuffer) code}. */
    public static void ncode(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + GLSLangInput.CODE, memAddressSafe(value));
    }
    /** Unsafe version of {@link #default_version(int) default_version}. */
    public static void ndefault_version(long struct, int value) { memPutInt(struct + GLSLangInput.DEFAULT_VERSION, value); }
    /** Unsafe version of {@link #default_profile(int) default_profile}. */
    public static void ndefault_profile(long struct, int value) { memPutInt(struct + GLSLangInput.DEFAULT_PROFILE, value); }
    /** Unsafe version of {@link #force_default_version_and_profile(boolean) force_default_version_and_profile}. */
    public static void nforce_default_version_and_profile(long struct, int value) { memPutInt(struct + GLSLangInput.FORCE_DEFAULT_VERSION_AND_PROFILE, value); }
    /** Unsafe version of {@link #forward_compatible(boolean) forward_compatible}. */
    public static void nforward_compatible(long struct, int value) { memPutInt(struct + GLSLangInput.FORWARD_COMPATIBLE, value); }
    /** Unsafe version of {@link #messages(int) messages}. */
    public static void nmessages(long struct, int value) { memPutInt(struct + GLSLangInput.MESSAGES, value); }
    /** Unsafe version of {@link #resource(GLSLangResource) resource}. */
    public static void nresource(long struct, @Nullable GLSLangResource value) { memPutAddress(struct + GLSLangInput.RESOURCE, memAddressSafe(value)); }
    /** Unsafe version of {@link #callbacks(GLSLIncludeCallbacks) callbacks}. */
    public static void ncallbacks(long struct, GLSLIncludeCallbacks value) { memCopy(value.address(), struct + GLSLangInput.CALLBACKS, GLSLIncludeCallbacks.SIZEOF); }
    /** Unsafe version of {@link #callbacks_ctx(long) callbacks_ctx}. */
    public static void ncallbacks_ctx(long struct, long value) { memPutAddress(struct + GLSLangInput.CALLBACKS_CTX, value); }

    // -----------------------------------

    /** An array of {@link GLSLangInput} structs. */
    public static class Buffer extends StructBuffer<GLSLangInput, Buffer> implements NativeResource {

        private static final GLSLangInput ELEMENT_FACTORY = GLSLangInput.create(-1L);

        /**
         * Creates a new {@code GLSLangInput.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GLSLangInput#SIZEOF}, and its mark will be undefined.</p>
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
        protected GLSLangInput getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code language} field. */
        @NativeType("glslang_source_t")
        public int language() { return GLSLangInput.nlanguage(address()); }
        /** @return the value of the {@code stage} field. */
        @NativeType("glslang_stage_t")
        public int stage() { return GLSLangInput.nstage(address()); }
        /** @return the value of the {@code client} field. */
        @NativeType("glslang_client_t")
        public int client() { return GLSLangInput.nclient(address()); }
        /** @return the value of the {@code client_version} field. */
        @NativeType("glslang_target_client_version_t")
        public int client_version() { return GLSLangInput.nclient_version(address()); }
        /** @return the value of the {@code target_language} field. */
        @NativeType("glslang_target_language_t")
        public int target_language() { return GLSLangInput.ntarget_language(address()); }
        /** @return the value of the {@code target_language_version} field. */
        @NativeType("glslang_target_language_version_t")
        public int target_language_version() { return GLSLangInput.ntarget_language_version(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code code} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer code() { return GLSLangInput.ncode(address()); }
        /** @return the null-terminated string pointed to by the {@code code} field. */
        @NativeType("char const *")
        public @Nullable String codeString() { return GLSLangInput.ncodeString(address()); }
        /** @return the value of the {@code default_version} field. */
        public int default_version() { return GLSLangInput.ndefault_version(address()); }
        /** @return the value of the {@code default_profile} field. */
        @NativeType("glslang_profile_t")
        public int default_profile() { return GLSLangInput.ndefault_profile(address()); }
        /** @return the value of the {@code force_default_version_and_profile} field. */
        @NativeType("int")
        public boolean force_default_version_and_profile() { return GLSLangInput.nforce_default_version_and_profile(address()) != 0; }
        /** @return the value of the {@code forward_compatible} field. */
        @NativeType("int")
        public boolean forward_compatible() { return GLSLangInput.nforward_compatible(address()) != 0; }
        /** @return the value of the {@code messages} field. */
        @NativeType("glslang_messages_t")
        public int messages() { return GLSLangInput.nmessages(address()); }
        /** @return a {@link GLSLangResource} view of the struct pointed to by the {@code resource} field. */
        @NativeType("glslang_resource_t const *")
        public @Nullable GLSLangResource resource() { return GLSLangInput.nresource(address()); }
        /** @return a {@link GLSLIncludeCallbacks} view of the {@code callbacks} field. */
        @NativeType("glsl_include_callbacks_t")
        public GLSLIncludeCallbacks callbacks() { return GLSLangInput.ncallbacks(address()); }
        /** @return the value of the {@code callbacks_ctx} field. */
        @NativeType("void *")
        public long callbacks_ctx() { return GLSLangInput.ncallbacks_ctx(address()); }

        /** Sets the specified value to the {@code language} field. */
        public GLSLangInput.Buffer language(@NativeType("glslang_source_t") int value) { GLSLangInput.nlanguage(address(), value); return this; }
        /** Sets the specified value to the {@code stage} field. */
        public GLSLangInput.Buffer stage(@NativeType("glslang_stage_t") int value) { GLSLangInput.nstage(address(), value); return this; }
        /** Sets the specified value to the {@code client} field. */
        public GLSLangInput.Buffer client(@NativeType("glslang_client_t") int value) { GLSLangInput.nclient(address(), value); return this; }
        /** Sets the specified value to the {@code client_version} field. */
        public GLSLangInput.Buffer client_version(@NativeType("glslang_target_client_version_t") int value) { GLSLangInput.nclient_version(address(), value); return this; }
        /** Sets the specified value to the {@code target_language} field. */
        public GLSLangInput.Buffer target_language(@NativeType("glslang_target_language_t") int value) { GLSLangInput.ntarget_language(address(), value); return this; }
        /** Sets the specified value to the {@code target_language_version} field. */
        public GLSLangInput.Buffer target_language_version(@NativeType("glslang_target_language_version_t") int value) { GLSLangInput.ntarget_language_version(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code code} field. */
        public GLSLangInput.Buffer code(@Nullable @NativeType("char const *") ByteBuffer value) { GLSLangInput.ncode(address(), value); return this; }
        /** Sets the specified value to the {@code default_version} field. */
        public GLSLangInput.Buffer default_version(int value) { GLSLangInput.ndefault_version(address(), value); return this; }
        /** Sets the specified value to the {@code default_profile} field. */
        public GLSLangInput.Buffer default_profile(@NativeType("glslang_profile_t") int value) { GLSLangInput.ndefault_profile(address(), value); return this; }
        /** Sets the specified value to the {@code force_default_version_and_profile} field. */
        public GLSLangInput.Buffer force_default_version_and_profile(@NativeType("int") boolean value) { GLSLangInput.nforce_default_version_and_profile(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code forward_compatible} field. */
        public GLSLangInput.Buffer forward_compatible(@NativeType("int") boolean value) { GLSLangInput.nforward_compatible(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code messages} field. */
        public GLSLangInput.Buffer messages(@NativeType("glslang_messages_t") int value) { GLSLangInput.nmessages(address(), value); return this; }
        /** Sets the address of the specified {@link GLSLangResource} to the {@code resource} field. */
        public GLSLangInput.Buffer resource(@Nullable @NativeType("glslang_resource_t const *") GLSLangResource value) { GLSLangInput.nresource(address(), value); return this; }
        /** Copies the specified {@link GLSLIncludeCallbacks} to the {@code callbacks} field. */
        public GLSLangInput.Buffer callbacks(@NativeType("glsl_include_callbacks_t") GLSLIncludeCallbacks value) { GLSLangInput.ncallbacks(address(), value); return this; }
        /** Passes the {@code callbacks} field to the specified {@link java.util.function.Consumer Consumer}. */
        public GLSLangInput.Buffer callbacks(java.util.function.Consumer<GLSLIncludeCallbacks> consumer) { consumer.accept(callbacks()); return this; }
        /** Sets the specified value to the {@code callbacks_ctx} field. */
        public GLSLangInput.Buffer callbacks_ctx(@NativeType("void *") long value) { GLSLangInput.ncallbacks_ctx(address(), value); return this; }

    }

}