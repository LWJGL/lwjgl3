/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_command_list.txt">NV_command_list</a> extension.
 * 
 * <p>This extension adds a few new features designed to provide very low overhead batching and replay of rendering commands and state changes:</p>
 * 
 * <ul>
 * <li>A state object, which stores a pre-validated representation of the state of (almost) the entire pipeline.</li>
 * <li>A more flexible and extensible MultiDrawIndirect (MDI) type of mechanism, using a token-based command stream, allowing to setup binding state and
 * emit draw calls.</li>
 * <li>A set of functions to execute a list of the token-based command streams with state object changes interleaved with the streams.</li>
 * <li>Command lists enabling compilation and reuse of sequences of command streams and state object changes.</li>
 * </ul>
 * 
 * <p>Because state objects reflect the state of the entire pipeline, it is expected that they can be pre-validated and executed efficiently. It is also
 * expected that when state objects are combined into a command list, the command list can diff consecutive state objects to produce a reduced/ optimized
 * set of state changes specific to that transition.</p>
 * 
 * <p>The token-based command stream can also be stored in regular buffer objects and therefore be modified by the server itself. This allows more complex
 * work creation than the original MDI approach, which was limited to emitting draw calls only.</p>
 * 
 * <h3>Command structures</h3>
 * 
 * <pre><code>
 * typedef struct {
 *   uint  header;
 * } TerminateSequenceCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 * } NOPCommandNV;
 * 
 * typedef  struct {
 *   uint  header;
 *   uint  count;
 *   uint  firstIndex;
 *   uint  baseVertex;
 * } DrawElementsCommandNV;
 * 
 * typedef  struct {
 *   uint  header;
 *   uint  count;
 *   uint  first;
 * } DrawArraysCommandNV;
 * 
 * typedef  struct {
 *   uint  header;
 *   uint  mode;
 *   uint  count;
 *   uint  instanceCount;
 *   uint  firstIndex;
 *   uint  baseVertex;
 *   uint  baseInstance;
 * } DrawElementsInstancedCommandNV;
 * 
 * typedef  struct {
 *   uint  header;
 *   uint  mode;
 *   uint  count;
 *   uint  instanceCount;
 *   uint  first;
 *   uint  baseInstance;
 * } DrawArraysInstancedCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   uint  addressLo;
 *   uint  addressHi;
 *   uint  typeSizeInByte;
 * } ElementAddressCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   uint  index;
 *   uint  addressLo;
 *   uint  addressHi;
 * } AttributeAddressCommandNV;
 * 
 * typedef struct {
 *   uint    header;
 *   ushort  index;
 *   ushort  stage;
 *   uint    addressLo;
 *   uint    addressHi;
 * } UniformAddressCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   float red;
 *   float green;
 *   float blue;
 *   float alpha;
 * } BlendColorCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   uint  frontStencilRef;
 *   uint  backStencilRef;
 * } StencilRefCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   float lineWidth;
 * } LineWidthCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   float scale;
 *   float bias;
 * } PolygonOffsetCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   float alphaRef;
 * } AlphaRefCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   uint  x;
 *   uint  y;
 *   uint  width;
 *   uint  height;
 * } ViewportCommandNV; // only ViewportIndex 0
 * 
 * typedef struct {
 *   uint  header;
 *   uint  x;
 *   uint  y;
 *   uint  width;
 *   uint  height;
 * } ScissorCommandNV; // only ViewportIndex 0
 * 
 * typedef struct {
 *   uint  header;
 *   uint  frontFace; // 0 for CW, 1 for CCW
 * } FrontFaceCommandNV;</code></pre>
 * 
 * <p>Tight packing is used for all structures.</p>
 */
public class NVCommandList {

    static { GL.initialize(); }

    /** Used in DrawCommandsStates buffer formats, in GetCommandHeaderNV to return the header. */
    public static final int
        GL_TERMINATE_SEQUENCE_COMMAND_NV      = 0x0,
        GL_NOP_COMMAND_NV                     = 0x1,
        GL_DRAW_ELEMENTS_COMMAND_NV           = 0x2,
        GL_DRAW_ARRAYS_COMMAND_NV             = 0x3,
        GL_DRAW_ELEMENTS_STRIP_COMMAND_NV     = 0x4,
        GL_DRAW_ARRAYS_STRIP_COMMAND_NV       = 0x5,
        GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV = 0x6,
        GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV   = 0x7,
        GL_ELEMENT_ADDRESS_COMMAND_NV         = 0x8,
        GL_ATTRIBUTE_ADDRESS_COMMAND_NV       = 0x9,
        GL_UNIFORM_ADDRESS_COMMAND_NV         = 0xA,
        GL_BLEND_COLOR_COMMAND_NV             = 0xB,
        GL_STENCIL_REF_COMMAND_NV             = 0xC,
        GL_LINE_WIDTH_COMMAND_NV              = 0xD,
        GL_POLYGON_OFFSET_COMMAND_NV          = 0xE,
        GL_ALPHA_REF_COMMAND_NV               = 0xF,
        GL_VIEWPORT_COMMAND_NV                = 0x10,
        GL_SCISSOR_COMMAND_NV                 = 0x11,
        GL_FRONT_FACE_COMMAND_NV              = 0x12;

    protected NVCommandList() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCreateStatesNV ] ---

    /**
     * Unsafe version of: {@link #glCreateStatesNV CreateStatesNV}
     *
     * @param n the number of state object names to create
     */
    public static native void nglCreateStatesNV(int n, long states);

    /**
     * Returns {@code n} previously unused state object names in {@code states}, and creates a state object in the initial state for each name.
     *
     * @param states the buffer in which to write the created state object names
     */
    public static void glCreateStatesNV(@NativeType("GLuint *") IntBuffer states) {
        nglCreateStatesNV(states.remaining(), memAddress(states));
    }

    /** Returns {@code n} previously unused state object names in {@code states}, and creates a state object in the initial state for each name. */
    @NativeType("void")
    public static int glCreateStatesNV() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer states = stack.callocInt(1);
            nglCreateStatesNV(1, memAddress(states));
            return states.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteStatesNV ] ---

    /**
     * Unsafe version of: {@link #glDeleteStatesNV DeleteStatesNV}
     *
     * @param n the number of state object names to delete
     */
    public static native void nglDeleteStatesNV(int n, long states);

    /**
     * Deletes {@code n} names of state objects given by {@code states}. Once a state object is deleted it has no contents and its name is again unused.
     * Unused names in {@code states} are silently ignored, as is the value zero.
     *
     * @param states the buffer from which to read the state object names to delete
     */
    public static void glDeleteStatesNV(@NativeType("GLuint const *") IntBuffer states) {
        nglDeleteStatesNV(states.remaining(), memAddress(states));
    }

    /**
     * Deletes {@code n} names of state objects given by {@code states}. Once a state object is deleted it has no contents and its name is again unused.
     * Unused names in {@code states} are silently ignored, as is the value zero.
     */
    public static void glDeleteStatesNV(@NativeType("GLuint const *") int state) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer states = stack.ints(state);
            nglDeleteStatesNV(1, memAddress(states));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsStateNV ] ---

    /**
     * Returns true if the specified name corresponds to a state object.
     *
     * @param state the object name to test
     */
    @NativeType("GLboolean")
    public static native boolean glIsStateNV(@NativeType("GLuint") int state);

    // --- [ glStateCaptureNV ] ---

    /**
     * Captures the current state of the rendering pipeline into the object indicated by {@code state}.
     * 
     * <p>The captured rendering state includes:</p>
     * 
     * <ul>
     * <li>Vertex attribute enable state, formats, types, relative offsets and strides, but not bound vertex buffers or vertex unified addresses, nor their
     * offsets, nor bound index buffers/addresses.</li>
     * <li>Primitive state such as primitive restart and patch parameters, provoking vertex.</li>
     * <li>Immediate vertex attribute values as provided by glVertexAttrib* or glVertexAttribI*</li>
     * <li>All active program binaries except compute (either from the active program pipeline or from UseProgram) with their current subroutine configuration
     * excluding all default-block uniform values.</li>
     * <li>Rasterization, multisample fragment operation, depth, stencil, and blending state.</li>
     * <li>Rasterization state such as line widths, stippling, polygon modes and offsets.</li>
     * <li>Viewport, scissor, and depth range state.</li>
     * <li>Framebuffer attachment configuration: attachment state including attachment formats, drawbuffer state, and target/layer information, but not
     * including actual attachments or sizes of attachments (these are stored separately).</li>
     * <li>Framebuffer attachment textures (but not residency state).</li>
     * </ul>
     *
     * @param state the state object into which to capture the current rendering state
     * @param mode  the basic Begin mode that this state object must be used with. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     */
    public static native void glStateCaptureNV(@NativeType("GLuint") int state, @NativeType("GLenum") int mode);

    // --- [ glGetCommandHeaderNV ] ---

    /**
     * Returns the encoded 32bit header value for a given command; the returned value is implementation specific.
     *
     * @param tokenID the command to query. One of:<br><table><tr><td>{@link #GL_TERMINATE_SEQUENCE_COMMAND_NV TERMINATE_SEQUENCE_COMMAND_NV}</td><td>{@link #GL_NOP_COMMAND_NV NOP_COMMAND_NV}</td><td>{@link #GL_DRAW_ELEMENTS_COMMAND_NV DRAW_ELEMENTS_COMMAND_NV}</td></tr><tr><td>{@link #GL_DRAW_ARRAYS_COMMAND_NV DRAW_ARRAYS_COMMAND_NV}</td><td>{@link #GL_DRAW_ELEMENTS_STRIP_COMMAND_NV DRAW_ELEMENTS_STRIP_COMMAND_NV}</td><td>{@link #GL_DRAW_ARRAYS_STRIP_COMMAND_NV DRAW_ARRAYS_STRIP_COMMAND_NV}</td></tr><tr><td>{@link #GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV DRAW_ELEMENTS_INSTANCED_COMMAND_NV}</td><td>{@link #GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV DRAW_ARRAYS_INSTANCED_COMMAND_NV}</td><td>{@link #GL_ELEMENT_ADDRESS_COMMAND_NV ELEMENT_ADDRESS_COMMAND_NV}</td></tr><tr><td>{@link #GL_ATTRIBUTE_ADDRESS_COMMAND_NV ATTRIBUTE_ADDRESS_COMMAND_NV}</td><td>{@link #GL_UNIFORM_ADDRESS_COMMAND_NV UNIFORM_ADDRESS_COMMAND_NV}</td><td>{@link #GL_BLEND_COLOR_COMMAND_NV BLEND_COLOR_COMMAND_NV}</td></tr><tr><td>{@link #GL_STENCIL_REF_COMMAND_NV STENCIL_REF_COMMAND_NV}</td><td>{@link #GL_LINE_WIDTH_COMMAND_NV LINE_WIDTH_COMMAND_NV}</td><td>{@link #GL_POLYGON_OFFSET_COMMAND_NV POLYGON_OFFSET_COMMAND_NV}</td></tr><tr><td>{@link #GL_ALPHA_REF_COMMAND_NV ALPHA_REF_COMMAND_NV}</td><td>{@link #GL_VIEWPORT_COMMAND_NV VIEWPORT_COMMAND_NV}</td><td>{@link #GL_SCISSOR_COMMAND_NV SCISSOR_COMMAND_NV}</td></tr><tr><td>{@link #GL_FRONT_FACE_COMMAND_NV FRONT_FACE_COMMAND_NV}</td></tr></table>
     * @param size    provided as basic consistency check, since the size of each structure is fixed and no padding is allowed. The value is the sum of the header and
     *                the command specific structure.
     */
    @NativeType("GLuint")
    public static native int glGetCommandHeaderNV(@NativeType("GLenum") int tokenID, @NativeType("GLuint") int size);

    // --- [ glGetStageIndexNV ] ---

    /**
     * Returns the 16bit value for a specific shader stage; the returned value is implementation specific. The value is to be used with the stage field within
     * {@code UniformAddressCommandNV} tokens.
     *
     * @param shadertype the shader stage type
     */
    @NativeType("GLushort")
    public static native short glGetStageIndexNV(@NativeType("GLenum") int shadertype);

    // --- [ glDrawCommandsNV ] ---

    /**
     * Unsafe version of: {@link #glDrawCommandsNV DrawCommandsNV}
     *
     * @param count the number of commands
     */
    public static native void nglDrawCommandsNV(int primitiveMode, int buffer, long indirects, long sizes, int count);

    /**
     * Accepts arrays of buffer addresses as an array of offsets {@code indirects} into a buffer named by {@code buffer}, an array of command lengths in
     * {@code sizes}. All arrays have {@code count} entries.
     *
     * @param primitiveMode the primitive mode
     * @param buffer        the buffer object name
     * @param indirects     the array of offsets into the buffer
     * @param sizes         the array of command lengths
     */
    public static void glDrawCommandsNV(@NativeType("GLenum") int primitiveMode, @NativeType("GLuint") int buffer, @NativeType("GLintptr const *") PointerBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes) {
        if (CHECKS) {
            check(sizes, indirects.remaining());
        }
        nglDrawCommandsNV(primitiveMode, buffer, memAddress(indirects), memAddress(sizes), indirects.remaining());
    }

    // --- [ glDrawCommandsAddressNV ] ---

    /**
     * Unsafe version of: {@link #glDrawCommandsAddressNV DrawCommandsAddressNV}
     *
     * @param count the number of commands
     */
    public static native void nglDrawCommandsAddressNV(int primitiveMode, long indirects, long sizes, int count);

    /**
     * Accepts arrays of buffer addresses as an array of GPU addresses {@code indirects}, an array of sequence lengths in {@code sizes}. All arrays have
     * {@code count} entries.
     *
     * @param primitiveMode the primitive mode
     * @param indirects     the array of GPU addreses
     * @param sizes         the array of command lengths
     */
    public static void glDrawCommandsAddressNV(@NativeType("GLenum") int primitiveMode, @NativeType("GLuint64 const *") LongBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes) {
        if (CHECKS) {
            check(sizes, indirects.remaining());
        }
        nglDrawCommandsAddressNV(primitiveMode, memAddress(indirects), memAddress(sizes), indirects.remaining());
    }

    // --- [ glDrawCommandsStatesNV ] ---

    /**
     * Unsafe version of: {@link #glDrawCommandsStatesNV DrawCommandsStatesNV}
     *
     * @param count the number of commands
     */
    public static native void nglDrawCommandsStatesNV(int buffer, long indirects, long sizes, long states, long fbos, int count);

    /**
     * Accepts arrays of buffer addresses as an array of offsets {@code indirects} into a buffer named by {@code buffer}, an array of command lengths in
     * {@code sizes}, and an array of state object names in {@code states}, of which all names must be non-zero. Frame buffer object names are stored in
     * {@code fbos} and can be either zero or non-zero. All arrays have {@code count} entries. The residency of textures used as attachment inside the state
     * object's captured fbo or the passed fbo must managed explicitly.
     *
     * @param buffer    the buffer object name
     * @param indirects the array of offsets into the buffer
     * @param sizes     the array of command lengths
     * @param states    the array of state object names
     * @param fbos      the array of framebuffer object names
     */
    public static void glDrawCommandsStatesNV(@NativeType("GLuint") int buffer, @NativeType("GLintptr const *") PointerBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes, @NativeType("GLuint const *") IntBuffer states, @NativeType("GLuint const *") IntBuffer fbos) {
        if (CHECKS) {
            check(sizes, indirects.remaining());
            check(states, indirects.remaining());
            check(fbos, indirects.remaining());
        }
        nglDrawCommandsStatesNV(buffer, memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), indirects.remaining());
    }

    // --- [ glDrawCommandsStatesAddressNV ] ---

    /**
     * Unsafe version of: {@link #glDrawCommandsStatesAddressNV DrawCommandsStatesAddressNV}
     *
     * @param count the number of commands
     */
    public static native void nglDrawCommandsStatesAddressNV(long indirects, long sizes, long states, long fbos, int count);

    /**
     * Accepts arrays of buffer addresses as an array of GPU addresses {@code indirects}, an array of command lengths in {@code sizes}, and an array of state
     * object names in {@code states}, of which all names must be non-zero. Frame buffer object names are stored in {@code fbos} and can be either zero or
     * non-zero. All arrays have {@code count} entries. The residency of textures used as attachment inside the state object's captured fbo or the passed fbo
     * must managed explicitly.
     *
     * @param indirects the array of GPU addresses
     * @param sizes     the array of command lengths
     * @param states    the array of state object names
     * @param fbos      the array of framebuffer object names
     */
    public static void glDrawCommandsStatesAddressNV(@NativeType("GLuint64 const *") LongBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes, @NativeType("GLuint const *") IntBuffer states, @NativeType("GLuint const *") IntBuffer fbos) {
        if (CHECKS) {
            check(sizes, indirects.remaining());
            check(states, indirects.remaining());
            check(fbos, indirects.remaining());
        }
        nglDrawCommandsStatesAddressNV(memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), indirects.remaining());
    }

    // --- [ glCreateCommandListsNV ] ---

    /**
     * Unsafe version of: {@link #glCreateCommandListsNV CreateCommandListsNV}
     *
     * @param n the number of command list names to create
     */
    public static native void nglCreateCommandListsNV(int n, long lists);

    /**
     * Returns {@code n} previously unused command list names in {@code lists}, and creates a command list in the initial state for each name.
     *
     * @param lists the buffer in which to return the created command list names
     */
    public static void glCreateCommandListsNV(@NativeType("GLuint *") IntBuffer lists) {
        nglCreateCommandListsNV(lists.remaining(), memAddress(lists));
    }

    /** Returns {@code n} previously unused command list names in {@code lists}, and creates a command list in the initial state for each name. */
    @NativeType("void")
    public static int glCreateCommandListsNV() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer lists = stack.callocInt(1);
            nglCreateCommandListsNV(1, memAddress(lists));
            return lists.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteCommandListsNV ] ---

    /**
     * Unsafe version of: {@link #glDeleteCommandListsNV DeleteCommandListsNV}
     *
     * @param n the number of command list names to delete
     */
    public static native void nglDeleteCommandListsNV(int n, long lists);

    /**
     * Deletes {@code n} command lists stored in {@code lists}. Once a command list is deleted it has no contents and its name is again unused. Unused names
     * in {@code lists} are silently ignored, as is the value zero.
     *
     * @param lists the buffer from which to read the command list names to delete
     */
    public static void glDeleteCommandListsNV(@NativeType("GLuint const *") IntBuffer lists) {
        nglDeleteCommandListsNV(lists.remaining(), memAddress(lists));
    }

    /**
     * Deletes {@code n} command lists stored in {@code lists}. Once a command list is deleted it has no contents and its name is again unused. Unused names
     * in {@code lists} are silently ignored, as is the value zero.
     */
    public static void glDeleteCommandListsNV(@NativeType("GLuint const *") int list) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer lists = stack.ints(list);
            nglDeleteCommandListsNV(1, memAddress(lists));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsCommandListNV ] ---

    /**
     * Returns true if the specified name corresponds to a command list.
     *
     * @param list the object name to query
     */
    @NativeType("GLboolean")
    public static native boolean glIsCommandListNV(@NativeType("GLuint") int list);

    // --- [ glListDrawCommandsStatesClientNV ] ---

    /**
     * Unsafe version of: {@link #glListDrawCommandsStatesClientNV ListDrawCommandsStatesClientNV}
     *
     * @param count the number of commands
     */
    public static native void nglListDrawCommandsStatesClientNV(int list, int segment, long indirects, long sizes, long states, long fbos, int count);

    /**
     * A list has multiple segments and each segment enqueues an ordered list of commands. This command enqueues the equivalent of the
     * DrawCommandsStatesClientNV commands into the list indicated by {@code list} on the segment indicated by {@code segment}.
     * 
     * <p>A list has multiple segments and each segment enqueues an ordered list of command sequences. This command enqueues the equivalent of the
     * DrawCommandsStatesNV commands into the list indicated by {@code list} on the segment indicated by {@code segment} except that the sequence data is
     * copied from the sequences pointed to by the {@code indirects} pointer. The {@code indirects} pointer should point to a list of size {@code count} of
     * pointers, each of which should point to a command sequence.</p>
     * 
     * <p>The pre-validated state from {@code states} is saved into the command list, rather than a reference to the state object (i.e. the state objects or fbos
     * could be deleted and the command list would be unaffected). This includes native GPU addresses for all textures indirectly referenced through the fbos
     * passed or state objects' fbos attachments, therefore a recompile of the command list is required if such referenced textures change their allocation
     * (for example due to resizing), as well as explicit management of the residency of the textures prior {@link #glCallCommandListNV CallCommandListNV}.</p>
     * 
     * <p>ListDrawCommandsStatesClientNV performs a by-value copy of the indirect data based on the provided client-side pointers. In this case the content is
     * fully immutable, while the buffer-based versions can change the content of the buffers at any later time.</p>
     *
     * @param list      the command list
     * @param segment   the segment
     * @param indirects the array of GPU addresses
     * @param sizes     the array of command lengths
     * @param states    the array of state object names
     * @param fbos      the array of framebuffer object names
     */
    public static void glListDrawCommandsStatesClientNV(@NativeType("GLuint") int list, @NativeType("GLuint") int segment, @NativeType("void const **") PointerBuffer indirects, @NativeType("GLsizei const *") IntBuffer sizes, @NativeType("GLuint const *") IntBuffer states, @NativeType("GLuint const *") IntBuffer fbos) {
        if (CHECKS) {
            check(sizes, indirects.remaining());
            check(states, indirects.remaining());
            check(fbos, indirects.remaining());
        }
        nglListDrawCommandsStatesClientNV(list, segment, memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), indirects.remaining());
    }

    // --- [ glCommandListSegmentsNV ] ---

    /**
     * Indicates that {@code list} will have {@code segments} number of segments, each of which is a list of command sequences that it enqueues. This must be
     * called before any commands are enqueued. In the initial state, a command list has a single segment.
     *
     * @param list     the command list
     * @param segments the number of ordered sequences of commands
     */
    public static native void glCommandListSegmentsNV(@NativeType("GLuint") int list, @NativeType("GLuint") int segments);

    // --- [ glCompileCommandListNV ] ---

    /**
     * Makes the list indicated by {@code list} switch from allowing collection of commands to allowing its execution. At this time, the implementation may
     * generate optimized commands to transition between states as efficiently as possible.
     *
     * @param list the command list to compile
     */
    public static native void glCompileCommandListNV(@NativeType("GLuint") int list);

    // --- [ glCallCommandListNV ] ---

    /**
     * Executes the command list indicated by {@code list}, which operates as if the DrawCommandsStates* commands were replayed in the order they were
     * enqueued on each segment, starting from segment zero and proceeding to the maximum segment. All buffer or texture resources' residency must be managed
     * explicitly, including texture attachments of the effective fbos during list enqueuing.
     *
     * @param list the command list to call
     */
    public static native void glCallCommandListNV(@NativeType("GLuint") int list);

    /** Array version of: {@link #glCreateStatesNV CreateStatesNV} */
    public static void glCreateStatesNV(@NativeType("GLuint *") int[] states) {
        long __functionAddress = GL.getICD().glCreateStatesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(states.length, states, __functionAddress);
    }

    /** Array version of: {@link #glDeleteStatesNV DeleteStatesNV} */
    public static void glDeleteStatesNV(@NativeType("GLuint const *") int[] states) {
        long __functionAddress = GL.getICD().glDeleteStatesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(states.length, states, __functionAddress);
    }

    /** Array version of: {@link #glDrawCommandsNV DrawCommandsNV} */
    public static void glDrawCommandsNV(@NativeType("GLenum") int primitiveMode, @NativeType("GLuint") int buffer, @NativeType("GLintptr const *") PointerBuffer indirects, @NativeType("GLsizei const *") int[] sizes) {
        long __functionAddress = GL.getICD().glDrawCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sizes, indirects.remaining());
        }
        callPPV(primitiveMode, buffer, memAddress(indirects), sizes, indirects.remaining(), __functionAddress);
    }

    /** Array version of: {@link #glDrawCommandsAddressNV DrawCommandsAddressNV} */
    public static void glDrawCommandsAddressNV(@NativeType("GLenum") int primitiveMode, @NativeType("GLuint64 const *") long[] indirects, @NativeType("GLsizei const *") int[] sizes) {
        long __functionAddress = GL.getICD().glDrawCommandsAddressNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sizes, indirects.length);
        }
        callPPV(primitiveMode, indirects, sizes, indirects.length, __functionAddress);
    }

    /** Array version of: {@link #glDrawCommandsStatesNV DrawCommandsStatesNV} */
    public static void glDrawCommandsStatesNV(@NativeType("GLuint") int buffer, @NativeType("GLintptr const *") PointerBuffer indirects, @NativeType("GLsizei const *") int[] sizes, @NativeType("GLuint const *") int[] states, @NativeType("GLuint const *") int[] fbos) {
        long __functionAddress = GL.getICD().glDrawCommandsStatesNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sizes, indirects.remaining());
            check(states, indirects.remaining());
            check(fbos, indirects.remaining());
        }
        callPPPPV(buffer, memAddress(indirects), sizes, states, fbos, indirects.remaining(), __functionAddress);
    }

    /** Array version of: {@link #glDrawCommandsStatesAddressNV DrawCommandsStatesAddressNV} */
    public static void glDrawCommandsStatesAddressNV(@NativeType("GLuint64 const *") long[] indirects, @NativeType("GLsizei const *") int[] sizes, @NativeType("GLuint const *") int[] states, @NativeType("GLuint const *") int[] fbos) {
        long __functionAddress = GL.getICD().glDrawCommandsStatesAddressNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sizes, indirects.length);
            check(states, indirects.length);
            check(fbos, indirects.length);
        }
        callPPPPV(indirects, sizes, states, fbos, indirects.length, __functionAddress);
    }

    /** Array version of: {@link #glCreateCommandListsNV CreateCommandListsNV} */
    public static void glCreateCommandListsNV(@NativeType("GLuint *") int[] lists) {
        long __functionAddress = GL.getICD().glCreateCommandListsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(lists.length, lists, __functionAddress);
    }

    /** Array version of: {@link #glDeleteCommandListsNV DeleteCommandListsNV} */
    public static void glDeleteCommandListsNV(@NativeType("GLuint const *") int[] lists) {
        long __functionAddress = GL.getICD().glDeleteCommandListsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(lists.length, lists, __functionAddress);
    }

    /** Array version of: {@link #glListDrawCommandsStatesClientNV ListDrawCommandsStatesClientNV} */
    public static void glListDrawCommandsStatesClientNV(@NativeType("GLuint") int list, @NativeType("GLuint") int segment, @NativeType("void const **") PointerBuffer indirects, @NativeType("GLsizei const *") int[] sizes, @NativeType("GLuint const *") int[] states, @NativeType("GLuint const *") int[] fbos) {
        long __functionAddress = GL.getICD().glListDrawCommandsStatesClientNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sizes, indirects.remaining());
            check(states, indirects.remaining());
            check(fbos, indirects.remaining());
        }
        callPPPPV(list, segment, memAddress(indirects), sizes, states, fbos, indirects.remaining(), __functionAddress);
    }

}