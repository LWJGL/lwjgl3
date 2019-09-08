uniform vec4 u_COLOR;

#if __VERSION__ < 130
    varying float v_Shade;

    #define out_Color gl_FragColor
#else
    in float v_Shade;

    #if __VERSION__ < 330
        out vec4 out_Color;
    #else
        layout(location = 0) out vec4 out_Color;
    #endif
#endif

void main() {
    out_Color = vec4(u_COLOR.xyz * v_Shade, u_COLOR.w);
}
