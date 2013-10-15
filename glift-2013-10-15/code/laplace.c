#include <gliftCg.h>

float4 main( NeighborIter it ) : COLOR
{
  // Finite difference discrete Laplacian
  float4 offset( 1, 0, 0, 0 );
  float4 laplace = -8 * it.value( 0 );
  for ( float i = 0; i < 4; ++i ) {
    laplace += it.value( offset );
    laplace += it.value( -offset );
    offset = offset.yzwx;
  }
  return laplace;
}
