package gui;

import java.awt.event.ActionListener;

public interface View {

    public void setLabelText(String text);
    public void setButtonLinksText(String text);
    public void setButtonRechtsText(String text);
    public void setButtonUntenText(String text);

    public void setRaus(ActionListener actionListener);
    public void setRein(ActionListener actionListener);
    public void reset(ActionListener actionListener);

}
