/* 

   Copyright (C) 2003 Krzysztof Langner

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program; if not, write to the 
   Free Software Foundation, Inc., 
   59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/


package soccer.server;

import java.net.InetAddress;

import soccer.server.sim.Splayer;


/**
 * This class is a proxy to player object
 * 
 * @author Krzysztof Langner
 */
public class PlayerProxy
{
  // networking properties
  public InetAddress  address;
  public int          port;
  public Splayer      player;

  public PlayerProxy(InetAddress address, int port, Splayer player)
  {
    this.address = address;
    this.port = port;
    this.player = player;
  }
    
}