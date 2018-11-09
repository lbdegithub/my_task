package com.lb.server.my.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * @author LiBin
 * @email libin@ellabook.cn
 * @date 2018-11-09 11:41
 **/
public class ChatRoomServerHandler extends ChannelHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("接入成功");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("client:" + msg);
        String result = "I don't know what you're talking about " + System.getProperty("line.separator");
        System.out.println("server:" + result);
        ByteBuf resp = Unpooled.copiedBuffer(result.getBytes());
        ctx.writeAndFlush(resp);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channelReadComplete");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("error msg:" + cause.getMessage());
        ctx.close();
    }
}
