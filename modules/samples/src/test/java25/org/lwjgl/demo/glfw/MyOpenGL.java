/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.glfw;

import org.lwjgl.system.ffm.*;

import java.lang.foreign.*;

@FFMPrefix("gl")
@FFMCharset(FFMCharset.Type.UTF8)
public interface MyOpenGL {
    @FFMDefinition("void glClear(GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha)")
    void ClearColor(float red, float green, float blue, float alpha);

    @FFMDefinition("void glClear(GLbitfield mask)")
    void Clear(int mask);

    @FFMDefinition("void glGetIntegerv(GLenum name, GLint * params)")
    @FFMName("glGetIntegerv") @FFMReturn(1)
    int GetInteger(StackAllocator<?> stack, int name);

    @FFMDefinition("GLubyte const * glGetIntegerv(GLenum name)")
    String GetString(int name);

    @FFMDefinition("GLuint glCreateShader(GLenum type)")
    int CreateShader(int type);

    @FFMDefinition("void glCompileShader(GLuint shader)")
    void CompileShader(int shader);

    @FFMDefinition("void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * string, GLint const * length)")
    void ShaderSource(int shader, int count, MemorySegment string, MemorySegment length);

    @FFMDefinition("void glGetShaderInfoLog(GLuint shader, GLsizei bufSize, GLsizei * length, GLchar * infoLog)")
    @FFMReturn(3) @FFMReturn.SizeOut(2)
    String GetShaderInfoLog(StackAllocator<?> allocator, int shader, @FFMReturn.Size int bufSize);

    @FFMDefinition("void glGetShaderiv(GLuint shader, GLenum pname, GLint * params)")
    @FFMName("glGetShaderiv") @FFMReturn(2)
    int GetShaderi(int shader, int pname);

    @FFMDefinition("void glGetShaderSource(GLuint shader, GLsizei bufSize, GLsizei * length, GLchar * source)")
    @FFMReturn(3) @FFMReturn.SizeOut(2)
    String GetShaderSource(StackAllocator<?> allocator, int shader, @FFMReturn.Size int bufSize);

    @FFMDefinition("void glDeleteShader(GLuint shader)")
    void DeleteShader(int shader);
}
